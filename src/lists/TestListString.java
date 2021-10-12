package lists;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * TP 10 - Exercise 4
 * @author clarousse
 *
 */
public class TestListString {

	public static void main(String[] args) {

		List<String> anotherList = Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(anotherList);

		int maxLength = 0;
		String longestString = null;
		
		for(String item : list) {
			if(item.length() > maxLength) {
				maxLength = item.length();
				longestString = item;
			}
		}
		System.out.println("Longest string : " + longestString);
		
		list.replaceAll(String::toUpperCase);
		System.out.println("List to upper case : " + list);
		
		Iterator<String> it = list.iterator();

		while(it.hasNext()) {
			String str = it.next();
			if(str.charAt(0) == 'N') {
				it.remove();
			}
		}
		
		System.out.println("Result list : " + list);

	}

}
