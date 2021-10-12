package lists;

/**
 * TP 10 - Exercise 5 Part1
 * @author clarousse
 *
 */
public class City {

	private String name;
	private int nbResidents;
	
	public City(String name, int nbResidents) {
		this.name = name;
		this.nbResidents = nbResidents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbResidents() {
		return nbResidents;
	}

	public void setNbResidents(int nbResidents) {
		this.nbResidents = nbResidents;
	}
}
