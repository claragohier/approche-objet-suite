package lists;
import java.util.ArrayList;

/**
 * TP 10 - Exercise 1
 * @author clarousse
 *
 */
public class ListCreation {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
		
		System.out.println(list.size());
	}

}
