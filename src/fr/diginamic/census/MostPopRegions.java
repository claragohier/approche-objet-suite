package fr.diginamic.census;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.HashMap;

public class MostPopRegions {

	public void traiter(Census census) {
		
		List<City> cities = new ArrayList<City>(census.getCities());
		HashMap<String, Integer> regions = new HashMap<String, Integer>();
		
		int regionCode = 0;
		int pop = 0;
		String regionName = null;
		
		for(City city : cities) {
			int regCode = city.getDep().getRegion().getRegionCode();

			if(regCode == regionCode) {
				pop += city.getTotalPop();
				regionName = city.getDep().getRegion().getRegionName();
				regions.put(regionName, pop);
			}
			
			regionCode = regCode;
		}
		
		List<Entry<String, Integer>> list = new ArrayList<>(regions.entrySet());
		list.sort(Entry.comparingByValue());
		
		Object[] listArray = list.toArray();
		
		System.out.println("Most populated regions are : ");
		

		for(int i = 0; i < 9; i++) {
			String str = listArray[i].toString();
			String finalStr = str.substring(0, str.indexOf('='));
			
			System.out.println("n° : " + finalStr);
		}
	}
}
