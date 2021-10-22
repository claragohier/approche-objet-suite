package fr.diginamic.censusintro;

import java.util.ArrayList;
import java.util.List;

public class Region {
	
	private int regionCode;
	private String regionName;
	private int population;
	private List<City> cities = new ArrayList<>();
	
	public Region(int regionCode, String regionName) {
		this.regionCode = regionCode;
		this.regionName = regionName;
	}
	
	public int addCity(City city) {
		this.cities.add(city);
		int pop = 0;
		pop += city.getPop();
		return pop;
	}

	public int compareTo(City other) {
		if (this.getPopulation() > other.getPop()) {
			return 1;
		}
		if (this.getPopulation() < other.getPop()) {
			return -1;
		}

		return 0;
	}

	/**
	 * @return the regionCode
	 */
	public int getRegionCode() {
		return regionCode;
	}

	/**
	 * @param regionCode the regionCode to set
	 */
	public void setRegionCode(int regionCode) {
		this.regionCode = regionCode;
	}

	/**
	 * @return the regionName
	 */
	public String getRegionName() {
		return regionName;
	}

	/**
	 * @param regionName the regionName to set
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

}
