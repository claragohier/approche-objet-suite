package maps;
import java.util.HashMap;

/**
 * TP 12 - Exercise 3
 * @author clarousse
 *
 */
public class MapMerge {

	public static void main(String[] args) {
		
		// Creation map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Red");
		map1.put(2, "Green");
		map1.put(3, "Orange");
		
		// Creation map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "White");
		map2.put(5, "Blue");
		map2.put(6, "Orange");
		
		// Creation map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.putAll(map1);
		map3.putAll(map2);
		
		System.out.println(map3.size());
	}

}
