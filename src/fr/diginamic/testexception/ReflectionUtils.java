package fr.diginamic.testexception;

import java.lang.reflect.Field;

public class ReflectionUtils {

	public static void afficherAttributs(Object obj) throws IllegalArgumentException, IllegalAccessException, ArgNullException {

		if (obj == null) {
			throw new ArgNullException("Please enter an existing city.");
		}
		
		Class<?> classe = obj.getClass();

		Field[] fields = classe.getDeclaredFields();

		for (Field field : fields) {

			field.setAccessible(true);

			System.out.println("Attribute's value " + field.getName() + " is " + field.get(obj).toString());
		}
	}

}
