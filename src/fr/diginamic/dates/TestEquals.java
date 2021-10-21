package fr.diginamic.dates;

import fr.diginamic.testenumeration.Continent;

public class TestEquals {

	public static void main(String[] args) {

		City c1 = new City(34, "Béziers", Continent.EUROPE);
		City c2 = new City(34, "Béziers", Continent.EUROPE);
		City c3 = new City(34, "Mtp", Continent.EUROPE);
		
		System.out.println(c1.getName() == c2.getName());
	}

}
