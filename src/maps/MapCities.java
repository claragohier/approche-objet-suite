package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import lists.City;

public class MapCities {

	public static void main(String[] args) {

		ArrayList<City> cities = new ArrayList<City>();
		cities.add(new City("Nice", 343000));
		cities.add(new City("Carcassonne", 47800));
		cities.add(new City("Narbonne", 53400));
		cities.add(new City("Lyon", 484000));
		cities.add(new City("Foix", 9700));
		cities.add(new City("Pau", 77200));
		cities.add(new City("Marseille", 850700));
		cities.add(new City("Tarbes", 40600));
		
		int resMax = 900000;
		String country = null;
		City item = null;
		String removeItem = null;
		
		HashMap<String, City> citiesMap = new HashMap<>();
		
		Iterator<City> it = cities.iterator();
		while(it.hasNext()) {
			City city = it.next();
			citiesMap.put(city.getName(), city);
		}
		
		Iterator<City> valuesIt = citiesMap.values().iterator();
		while(valuesIt.hasNext()) {
			City valCity = valuesIt.next();
			if(valCity.getNbResidents() < resMax) {
				resMax = valCity.getNbResidents();
				country = valCity.getName();
				item = valCity;
			}
		}
		
		for(Entry<String, City> entry : citiesMap.entrySet()) {
            if (entry.getValue().equals(item)) {
            	removeItem = entry.getKey();
            }
        }
        citiesMap.remove(removeItem);
		
        System.out.println("Result : ");
		for(City city : citiesMap.values()) {
			System.out.println(city.getName());
		}
		
	}

}
