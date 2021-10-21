package fr.diginamic.censusintro;

import java.util.List;
import java.util.ArrayList;

public class Department {
	
	private String depCode;
	private int population;
	private List<City> cities = new ArrayList<>();

	public Department(String depCode) {
		this.depCode = depCode;
	}
	
	public int addCity(City city) {
		this.cities.add(city);
		int pop = 0;
		pop += city.getPop();
		return pop;
	}
	
	public int compareTo(City other) {
		if(this.getPopulation() > other.getPop()) {
			return 1;
		}
		if(this.getPopulation() < other.getPop()) {
			return -1;
		}
		
		return 0;
	}
	
	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}
	
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
