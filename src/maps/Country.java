package maps;

public class Country {
	
	private String name;
	private long nbRes;
	private String continent;
	
	public Country(String name, long nbRes, String continent) {
		this.name = name;
		this.nbRes = nbRes;
		this.continent = continent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNbRes() {
		return nbRes;
	}

	public void setNbRes(long nbRes) {
		this.nbRes = nbRes;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	
}
