package fr.diginamic.dates;

public class TestEquals {

	public static void main(String[] args) {

		City c1 = new City(34, "Béziers");
		City c2 = new City(34, "Béziers");
		City c3 = new City(34, "Mtp");
		
		System.out.println(c1.getName() == c2.getName());
	}

}
