package fr.diginamic.strings;

public class TestStringBuilder {

	public static void main(String[] args) {

		long debut = System.currentTimeMillis();
		
		
		// 133
//		String str = new String("");
//		for(int i = 1; i < 10000; i++) {
//			str += i + ", ";
//		}
		
		// 11
		StringBuilder builder = new StringBuilder();

		for(int i = 1; i < 10000; i++) {
			builder.append(i).append(", ");
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println(fin - debut);
		System.out.println(builder.toString());
	}

}
