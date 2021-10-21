package fr.diginamic.census;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.HashMap;

public class MostPopDep {

public void traiter(Census census) {
		
		List<City> cities = new ArrayList<City>(census.getCities());
		HashMap<String, Integer> departments = new HashMap<String, Integer>();
		
		String depCode = null;
		int pop = 0;
		
		for(City city : cities) {
			String deptCode = city.getDep().getDepCode();
			if((deptCode != null) && deptCode.equals(depCode)) {
				pop += city.getTotalPop();
				departments.put(depCode, pop);
			}
			
			depCode = deptCode;
		}
		
		List<Entry<String, Integer>> list = new ArrayList<>(departments.entrySet());
		list.sort(Entry.comparingByValue());
		
		System.out.println(list);
		
		Object[] listArray = list.toArray();
		
		System.out.println("Most populated departments are : ");
		

		for(int i = 0; i < 9; i++) {
			String str = listArray[i].toString();
			String finalStr = str.substring(0, str.indexOf('='));
			
			System.out.println(i + " : " + finalStr);
		}
	}

}
