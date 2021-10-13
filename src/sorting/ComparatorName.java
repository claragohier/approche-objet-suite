package sorting;

import java.util.Comparator;

/**
 * TP 13 - Exercise 3
 * @author clarousse
 *
 */
public class ComparatorName implements Comparator<City> {

	public int compare(City c1, City c2) {
		int result = c1.getName().compareTo(c2.getName());
		return result;
	}
	
}
