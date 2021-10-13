package maps;
import java.util.HashMap;

/**
 * TP 12 - Exercise 2
 * @author clarousse
 *
 */
public class MapCreationManipulation {

	public static void main(String[] args) {

		HashMap<Integer, String> mapCities = new HashMap<>();
		mapCities.put(13, "Marseille");
		mapCities.put(34, "Montpellier");
		mapCities.put(44, "Nantes");
		mapCities.put(75, "Paris");
		mapCities.put(31, "Toulouse");
		
		mapCities.put(59, "Lille");
		mapCities.put(69, "Lyon");
		mapCities.put(33, "Bordeaux");
		
		System.out.println("Keys : ");
		for(Integer key : mapCities.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("Values : ");
		for(String value : mapCities.values()) {
			System.out.println(value);
		}
		
		System.out.println("Map size : " + mapCities.size());
		
	}

}
