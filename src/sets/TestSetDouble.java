package sets;
import java.util.Collections;
import java.util.HashSet;

/**
 * TP 11 - Exercise 2
 * @author clarousse
 *
 */
public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> set = new HashSet<Double>();
		set.add(1.5);
		set.add(8.25);
		set.add(7.32);
		set.add(13.3);
		set.add(12.45);
		set.add(48.5);
		set.add(0.01);
		
		double max = 0;
		for(Double nb : set) {
			System.out.println(nb);
		}
		
		System.out.println("Max : " + Collections.max(set));
		set.remove(Collections.min(set));
		System.out.println(set);

	}

}
