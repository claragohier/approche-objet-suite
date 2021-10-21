package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		for(Season value : Season.values()) {
			System.out.println(value);
			
			if(value.equals(Season.SUMMER)) {
				System.out.println("SUMMER is " + value.getNumber());
			}
			
		}
		System.out.println(Season.WINTER.getInstance("Winter"));
		
	}

}
