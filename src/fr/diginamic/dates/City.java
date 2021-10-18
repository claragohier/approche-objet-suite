package fr.diginamic.dates;

public class City {

	private int dep;
	private String name;
	
	public City(int dep, String name) {
		this.dep = dep;
		this.name = name;
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

}
