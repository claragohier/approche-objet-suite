package sets;
import java.util.HashSet;

/**
 * TP 11 - Exercise 3 Part2
 * @author clarousse
 *
 */
public class TestCountry {

	public static void main(String[] args) {

		HashSet<Country> set = new HashSet<Country>();
		set.add(new Country("USA", 3290000000L, 63500));
		set.add(new Country("France", 67000000L, 36625));
		set.add(new Country("Allemagne", 83000000L, 45723));
		set.add(new Country("UK", 67000000L, 40284));
		set.add(new Country("Italie", 59000000L, 31676));
		set.add(new Country("Japon", 126000000L, 40113));
		set.add(new Country("Chine", 1444000000L, 10500));
		set.add(new Country("Russie", 146000000L, 10126));
		set.add(new Country("Inde", 1300000000L, 1900));

		long pib = 0;
		String countryPibMax = null;
		long totalPib = 0;
		String countryPib = null;
		long calcul = 0;
		int i = 1;
		
		for(Country item : set) {
			if(item.getPibRes() > pib) {
				pib = item.getPibRes();
				countryPibMax = item.getName();
			}
			calcul = item.getNbResidents() * item.getPibRes();
			if(calcul > totalPib) {
				totalPib = calcul;
				countryPib = item.getName();
			}
			
			if(calcul < totalPib) {
				totalPib = calcul;
				if(set.size() == i) {
					item.setName(item.getName().toUpperCase());
					set.remove(item);

				}
			}
			
			System.out.println(item.getName() + " " + item.getNbResidents() + " " + calcul);
			i++;
		}
		
		System.out.println("pib per capita max : " + countryPibMax);
		System.out.println("total pib max : " + countryPib);
		
	}

}
