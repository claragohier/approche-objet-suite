package lists;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * TP 10 - Exercise 5 Part2
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
		
		Iterator<City> it = cities.iterator();

		int maxResidents = 0;
		String cityNameMax = null;
		
		int minResidents = 0;
		String cityNameMin = null;
		
		while(it.hasNext()) {
			City city = it.next();
			if(city.getNbResidents() > maxResidents) {
				maxResidents = city.getNbResidents();
				cityNameMax = city.getName();
			}
			
			minResidents = maxResidents;
			
			if(minResidents > city.getNbResidents() && it.hasNext() == false) {
				it.remove();
			}
			
			if(city.getNbResidents() > 100000) {
				city.setName(city.getName().toUpperCase());
			}
		}
		
		System.out.println("Most populous city : " + cityNameMax);
		System.out.println("Result : ");
		for(int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i).getName());
		}


	}

}
