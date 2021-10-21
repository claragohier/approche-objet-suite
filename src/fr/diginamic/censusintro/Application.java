package fr.diginamic.censusintro;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.censusintro.City;

public class Application {

	public static void main(String[] args) throws IOException {
		
		// step 1
		Path path = Paths.get("/Users/clarousse/CDA/Java/approche-objet-suite/src/file/recensement.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		List<City> cities = new ArrayList<City>();
		
		String header = "Code région;Nom de la région;Code département;Code arrondissement;Code canton;Code commune;Nom de la commune;Population municipale;Population comptée à part;Population totale;";

		for (String line : lines) {

			if (!line.equals(header)) {
				line = line.trim().replaceAll(" ", "");
				String[] string = line.split(";");
			
				City city = new City(Integer.parseInt(string[0]), string[1], string[2], Integer.parseInt(string[5]), string[6], Integer.parseInt(string[9]));
				cities.add(city);

			}
			
		}
		
//		// step 3
//		for(City city : cities) {
//			if(city.getCityName().equals("Montpellier")) {
//				System.out.println(city.toString());
//			}
//		}
//		
//		// step 4
//		System.out.println("Hérault's population : " + Operations.getPopDep(cities));
//	
//		// step 5
//		System.out.println("Min city of Hérault : " + Operations.getMinCity(cities));
//	
//		// step 6
//		Operations.getPopCities(cities);
//		
//		// step 7
//		System.out.println("Occitanie's population : " + Operations.getPopOccitanie(cities));
//	
//		// step 8
//		Operations.getMaxOccitanie(cities);
		Operations.getMaxDep(cities);
		
		// step 9
	}

}
