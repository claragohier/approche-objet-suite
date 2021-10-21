package fr.diginamic.census;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentPopulation {
	
	public int traiter(Census census, Scanner scanner) {
		
		System.out.println("Department code : ");
		String dep = scanner.nextLine();
		
		int pop = 0;
		
		List<City> cities = new ArrayList<City>(census.getCities());
		
		for(City city : cities) {
			String deptCode = city.getDep().getDepCode();
			if(deptCode.equals(dep)) {
				pop += city.getTotalPop();
			}
		}
		
		return pop;
	}
	
}
