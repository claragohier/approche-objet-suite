package fr.diginamic.census;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args)  throws IOException {
		
		Path path = Paths.get("/Users/clarousse/CDA/Java/approche-objet-suite/src/file/recensement.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		Census census = new Census(lines);	
		
		Scanner scanner = new Scanner(System.in);
		
		// menu 1
//		CityPopulation cityPop = new CityPopulation();
//		cityPop.traiter(census, scanner);
		
		// menu 2
//		DepartmentPopulation depPop = new DepartmentPopulation();
//		System.out.println(depPop.traiter(census, scanner));
		
		// menu 3
//		RegionPopulation regionPop = new RegionPopulation();
//		System.out.println(regionPop.traiter(census, scanner));
		
		// menu 4
//		MostPopRegions mostPopRegions = new MostPopRegions();
//		mostPopRegions.traiter(census);
		
		// menu 5
//		MostPopDep mostPopDep = new MostPopDep();
//		mostPopDep.traiter(census);
	}
}
