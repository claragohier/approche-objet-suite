package sorting;

/**
 * TP 13 - Exercise 1 / 2
 * 
 * @author clarousse
 *
 */
public class City implements Comparable<City> {

	private String name;
	private int nbResidents;

	public City(String name, int nbResidents) {
		this.name = name;
		this.nbResidents = nbResidents;
	}

	@Override
	public int compareTo(City other) {
//		return this.name.compareTo(other.name);
		if (this.nbResidents > other.nbResidents){
			return 1;
		}
		if(this.nbResidents<other.nbResidents){
			return -1;
		}
		return 0;
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