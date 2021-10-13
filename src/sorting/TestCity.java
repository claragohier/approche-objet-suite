package sorting;
import java.util.ArrayList;
import java.util.Collections;


/**
 * TP 13 - Exercise 1 / 2 / 3
 * @author clarousse
 *
 */
public class TestCity {

	public static void main(String[] args) {

		ArrayList<City> cities = new ArrayList<City>();
		cities.add(new City("Nice", 343000));
		cities.add(new City("Carcassonne", 47800));
		cities.add(new City("Narbonne", 53400));
		cities.add(new City("Lyon", 484000));
		cities.add(new City("Foix", 9700));
		cities.add(new City("Pau", 77200));
		cities.add(new City("Marseille", 850700));
		cities.add(new City("Tarbes", 40600));
		
		Collections.sort(cities, new ComparatorResident());
		System.out.println("---- Comparator resident : ");
		for(City city : cities) {
			System.out.println(city.getName() + " " + city.getNbResidents());
		}
		
		
		Collections.sort(cities, new ComparatorName());
		System.out.println("\n---- Comparator name : ");
		for(City city : cities) {
			System.out.println(city.getName() + " " + city.getNbResidents());
		}

	}

}
