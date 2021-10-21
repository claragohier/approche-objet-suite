package fr.diginamic.testexception;

import fr.diginamic.dates.City;
import fr.diginamic.testenumeration.Continent;

public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalAccessException, ArgNullException {

		City city = new City(34, "Béziers", Continent.EUROPE);
		ReflectionUtils.afficherAttributs(city);
		ReflectionUtils.afficherAttributs(null);
	}

}
