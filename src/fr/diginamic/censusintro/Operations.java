package fr.diginamic.censusintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.HashMap;

public class Operations {

	// step 4
	public static int getPopDep(List<City> cities) {
		int pop = 0;

		for (City city : cities) {
			if (city.getDepCode().equals("34")) {
				pop += city.getPop();
			}
		}

		return pop;
	}

	public static String getMinCity(List<City> cities) {

		List<City> heraultCities = new ArrayList<City>();
		int min = Integer.MAX_VALUE;
		String cityMin = null;

		for (City city : cities) {
			if (city.getDepCode().equals("34")) {
				heraultCities.add(city);
			}
		}

		Iterator<City> it = heraultCities.iterator();
		while (it.hasNext()) {
			City item = it.next();
			if (item.getPop() < min) {
				min = item.getPop();
				cityMin = item.getCityName();
			}
		}

		return cityMin;
	}

	public static void getPopCities(List<City> cities) {

		List<City> heraultCities = new ArrayList<City>();

		for (City city : cities) {
			if (city.getDepCode().equals("34")) {
				heraultCities.add(city);
			}
		}

		Collections.sort(heraultCities);
		System.out.println("Less populated cities of Hérault : ");

		for (int i = 0; i < 10; i++) {
			System.out.println(heraultCities.get(i).getCityName());
		}

		System.out.println("Most populated cities of Hérault : ");

		for (int i = heraultCities.size() - 1; i >= heraultCities.size() - 10; i--) {
			System.out.println(heraultCities.get(i).getCityName());
		}

	}

	public static int getPopOccitanie(List<City> cities) {

		int pop = 0;

		for (City city : cities) {
			if (city.getRegionName().equals("Occitanie")) {
				pop += city.getPop();
			}
		}

		return pop;
	}

	public static void getMaxOccitanie(List<City> cities) {

		List<City> occitanieCities = new ArrayList<City>();

		for (City city : cities) {
			if (city.getRegionName().equals("Occitanie")) {
				occitanieCities.add(city);
			}
		}

		Collections.sort(occitanieCities);

		System.out.println("Most populated cities of Occitanie : ");
		for (int i = occitanieCities.size() - 1; i >= occitanieCities.size() - 10; i--) {
			System.out.println(occitanieCities.get(i).getCityName());
		}

	}

	public static void getMaxDep(List<City> cities) {

		List<City> occitanieCities = new ArrayList<City>();
		HashMap<String, Department> departments = new HashMap<String, Department>();

		String codeDep = null;

		for (City city : cities) {
			if (city.getRegionName().equals("Occitanie")) {
				occitanieCities.add(city);
			}
		}

		for (City city : occitanieCities) {
			codeDep = city.getDepCode();

			if (!departments.containsKey(codeDep)) {
				Department dep = new Department(codeDep);
				departments.put(codeDep, dep);
				dep.addCity(city);
			}
		}
		
		List<Department> departmentsList = new ArrayList<Department>();
		departmentsList.addAll(departments.values());
		
		
		
	}

}
