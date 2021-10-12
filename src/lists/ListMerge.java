package lists;
import java.util.List;
import java.util.ArrayList;

/**
 * TP 10 - Exercise 2
 * @author clarousse
 *
 */
public class ListMerge {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("White");
		list2.add("Blue");
		list2.add("Orange");
		
		List<String> list3 = new ArrayList<String>();
		
		for(int i = 0; i < list1.size(); i++) {
			list3.add(list1.get(i));
		}
		
		for(int i = 0; i < list2.size(); i++) {
			list3.add(list2.get(i));
		}
		
		System.out.println(list3);
	}

}
