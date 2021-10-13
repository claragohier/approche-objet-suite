package sorting;

import java.util.Comparator;

/**
 * TP 13 - Exercise 3
 * @author clarousse
 *
 */
public class ComparatorResident implements Comparator<City> {
	
	public int compare(City c1, City c2) {
		return c1.getNbResidents() - c2.getNbResidents();
	}
}
