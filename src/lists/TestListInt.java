package lists;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * TP 10 - Exercise 3
 * @author clarousse
 *
 */
public class TestListInt {

	public static void main(String[] args) {

		List<Integer> anotherList = Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(anotherList);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Element " + i + " : " + list.get(i));
		}
		
		System.out.println("Liste size : " + list.size());
		System.out.println("Element max : " + Collections.max(list));
		
		list.remove(Collections.min(list));
		System.out.println("Result remove element min : " + list);
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < 0) {
				int value = Math.abs(list.get(i));
				list.set(i, value);
			}
		}
		
		System.out.println("Final list : " + list);

	}

}
