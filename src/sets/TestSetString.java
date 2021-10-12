package sets;
import java.util.HashSet;

/**
 * TP 11 - Exercise 2
 * @author clarousse
 *
 */
public class TestSetString {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		int maxLength = 0;
		String longestString = null;
		String removeItem = null;
		
		for(String item : set) {
			if(item.length() > maxLength) {
				maxLength = item.length();
				longestString = item;
				removeItem = item;
			}
		}
		System.out.println("Longest string : " + longestString);
		set.remove(removeItem);
		System.out.println(set);
	}

}
