package fr.diginamic.testenumeration;

public enum Continent {
	ASIA("Asia"), 
	AFRICA("Africa"), 
	NORTH_AMERICA("North America"), 
	SOUTH_AMERICA("South America"), 
	EUROPE("Europe");
	
	private String label;
	
	private Continent(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
}
