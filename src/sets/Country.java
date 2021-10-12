package sets;

/**
 * TP 11 - Exercise 3 Part1
 * @author clarousse
 *
 */
public class Country {
	
	private String name; 
	private long nbResidents;
	private int pibRes;
	
	public Country(String name, long nbResidents, int pibRes) {
		this.name = name;
		this.nbResidents = nbResidents;
		this.pibRes = pibRes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNbResidents() {
		return nbResidents;
	}

	public void setNbResidents(long nbResidents) {
		this.nbResidents = nbResidents;
	}

	public int getPibRes() {
		return pibRes;
	}

	public void setPibRes(int pibRes) {
		this.pibRes = pibRes;
	}
}
