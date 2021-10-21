package fr.diginamic.census;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegionPopulation {

	public int traiter(Census census, Scanner scanner) {

		System.out.println("Region code : ");
		String region = scanner.nextLine();
		int regionCode = Integer.parseInt(region);
		
		int pop = 0;

		List<City> cities = new ArrayList<City>(census.getCities());

		for (City city : cities) {
			int regCode = city.getDep().getRegion().getRegionCode();
			if (regCode == regionCode) {
				pop += city.getTotalPop();
			}
		}

		return pop;
	}

}
