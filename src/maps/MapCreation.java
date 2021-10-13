package maps;
import java.util.HashMap;

/**
 * TP 12 - Exercise 1
 * @author clarousse
 *
 */
public class MapCreation {

	public static void main(String[] args) {
		
		HashMap<String, Integer> mapSalaries = new HashMap<String, Integer>();
		mapSalaries.put("Paul", 1750);
		mapSalaries.put("Hicham", 1825);
		mapSalaries.put("Yu", 2250);
		mapSalaries.put("Ingrid", 2015);
		mapSalaries.put("Chantal", 2418);
		
		System.out.println("Map size : " + mapSalaries.size());
	}

}
