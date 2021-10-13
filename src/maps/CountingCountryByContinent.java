package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * TP 12 - Exercise 5
 * 
 * @author clarousse
 *
 */
public class CountingCountryByContinent {

	public static void main(String[] args) {

		ArrayList<Country> countries = new ArrayList<Country>();
		countries.add(new Country("France", 65000000L, "Europe"));
		countries.add(new Country("Allemagne", 80000000L, "Europe"));
		countries.add(new Country("Belgique", 10000000L, "Europe"));
		countries.add(new Country("Russie", 150000000L, "Asie"));
		countries.add(new Country("Chine", 1400000000L, "Asie"));
		countries.add(new Country("Indonésie", 220000000, "Océanie"));
		countries.add(new Country("Australie", 20000000, "Océanie"));

		int europe = 0;
		int asie = 0;
		int oceanie = 0;
		String continent = null;

		Iterator<Country> it = countries.iterator();
		while (it.hasNext()) {
			Country country = it.next();
			continent = country.getContinent();

			if (continent.equals("Europe")) {
				europe += 1;
			} else if (continent.equals("Asie")) {
				asie += 1;
			} else {
				oceanie += 1;
			}
		}
		
		HashMap<String, Integer> counting = new HashMap<String, Integer>();

		counting.put("Europe", europe);
		counting.put("Asie", asie);
		counting.put("Océanie", oceanie);
		
		System.out.println("Europe " + europe + " Asie " + asie + " Oceanie " + oceanie);

	}

}
