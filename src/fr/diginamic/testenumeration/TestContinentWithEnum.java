package fr.diginamic.testenumeration;

import java.util.List;
import java.util.ArrayList;

import fr.diginamic.dates.City;

public class TestContinentWithEnum {

	public static void main(String[] args) {

		City c1 = new City(34, "City1", Continent.EUROPE);
		City c2 = new City(02, "City2", Continent.AFRICA);
		City c3 = new City(42, "City3", Continent.ASIA);
		
		List<City> cities = new ArrayList<City>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		
		for(City city : cities) {
			System.out.println(city.toString());
		}

	}

}
