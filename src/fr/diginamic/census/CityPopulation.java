package fr.diginamic.census;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CityPopulation {

	public int traiter(Census census, Scanner scanner) {
		
		System.out.println("City : ");
		String city = scanner.nextLine();
		int pop = 0;
		
		List<City> cities = new ArrayList<City>(census.getCities());
		for(City item : cities) {
			if(item.getCityName().equals(city)) {
				pop = item.getTotalPop();
			} 
		}
		
		return pop;
	}
	
}
