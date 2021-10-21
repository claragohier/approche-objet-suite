package fr.diginamic.dates;

import fr.diginamic.testenumeration.Continent;

public class City {

	private int dep;
	private String name;
	private Continent continent;
	
	public City(int dep, String name, Continent continent) {
		this.dep = dep;
		this.name = name;
		this.continent = continent;
	}
	
	public String toString() {
		String str = this.getDep() + " " + this.getName() + " " + this.getContinent().getLabel();
		
		return str;
	}

	public int getDep() {
		return dep;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
