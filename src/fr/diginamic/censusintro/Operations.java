package fr.diginamic.censusintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

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

	// step 5
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

	// step 6
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
		// possible
//		Collections.sort(heraultCities, Collections.reverseOrder());
//		for (int i = 0; i < 10; i++) {
//			System.out.println(heraultCities.get(i).getCityName());
//		}

		// possible too
		for (int i = heraultCities.size() - 1; i >= heraultCities.size() - 10; i--) {
			System.out.println(heraultCities.get(i).getCityName());
		}

	}

	// step 7
	public static int getPopOccitanie(List<City> cities) {

		int pop = 0;

		for (City city : cities) {
			if (city.getRegionName().equals("Occitanie")) {
				pop += city.getPop();
			}
		}

		return pop;
	}

	// step 8
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

	// step 8
	public static void getMaxDep(List<City> cities) {

		List<City> occitanieCities = new ArrayList<City>();

		for (City city : cities) {
			if (city.getRegionName().equals("Occitanie")) {
				occitanieCities.add(city);
			}
		}

		Map<String, Integer> occitanie = new HashMap<>();

		for (City city : occitanieCities) {

			if (occitanie.containsKey(city.getDepCode())) {
				occitanie.put(city.getDepCode(), occitanie.get(city.getDepCode()) + city.getPop());
			} else {
				occitanie.put(city.getDepCode(), city.getPop());
			}
		}

		int max = Integer.MIN_VALUE;
		String dep = null;

		Iterator it = occitanie.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry) it.next();
			if (entry.getValue() > max) {
				max = entry.getValue();
				dep = entry.getKey();
			}
		}

		System.out.println("The department most populated of Occitanie : " + dep);

	}

	// step 9
	public static void getMostPopRegion(List<City> cities) {

		Map<String, Integer> regions = new HashMap<>();

		for (City city : cities) {

			if (regions.containsKey(city.getRegionName())) {
				regions.put(city.getRegionName(), regions.get(city.getRegionName()) + city.getPop());
			} else {
				regions.put(city.getRegionName(), city.getPop());
			}
		}
		
		List<Entry<String, Integer>> list = new ArrayList<>(regions.entrySet());
		list.sort(Entry.comparingByValue());

		System.out.println("The regions most populated of France : ");
		
		for (int i = list.size() - 1; i >= list.size() - 10; i--) {
			System.out.println(list.get(i).getKey());
		}
		
	}

	// step 9
	public static void getMostPopDep(List<City> cities) {
		
		Map<String, Integer> deps = new HashMap<>();

		for (City city : cities) {

			if (deps.containsKey(city.getDepCode())) {
				deps.put(city.getDepCode(), deps.get(city.getDepCode()) + city.getPop());
			} else {
				deps.put(city.getDepCode(), city.getPop());
			}
		}
		
		List<Entry<String, Integer>> list = new ArrayList<>(deps.entrySet());
		list.sort(Entry.comparingByValue());

		System.out.println("The departments most populated of France : ");
		
		for (int i = list.size() - 1; i >= list.size() - 10; i--) {
			System.out.println(list.get(i).getKey());
		}

	}

	// step 9
	public static void getMostPopCities(List<City> cities) {
		Collections.sort(cities);

		for (int i = cities.size() - 1; i >= cities.size() - 10; i--) {
			System.out.println(cities.get(i).getCityName());
		}
	}

}
