package file;

import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;


public class FileManipulation {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("/Users/clarousse/CDA/Java/approche-objet-suite/src/file/recensement.csv");

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		List<String> newLines = new ArrayList<>();
		
		
		String str = lines.toString();
		str = str.trim().replaceAll(" ", "");
		
		int pop = 0;
		
		for(String line : lines) {
			String[] strSplit = line.split(";");
			
			for(int i = 0; i < strSplit.length; i++) {				
				if(strSplit[9].equals("Population totale")) {
					pop = 0;
				} else {
					strSplit[9] = strSplit[9].trim().replaceAll(" ", "");
					pop = Integer.parseInt(strSplit[9]);
				}
				
				if(pop > 25000) {
					String newLine = strSplit[2].toString() + ";" + strSplit[6].toString() + ";" + strSplit[9].toString();
					newLines.add(newLine);
				}
			}
		}
		
	    Set<String> mySet = new HashSet<String>(newLines);
	    List<String> lines_list = new ArrayList<String>(mySet);
	    Collections.sort(lines_list);
	    
		Path pathCible = Paths.get("/Users/clarousse/CDA/Java/approche-objet-suite/src/file/new-recensement.csv");
		Files.write(pathCible, lines_list);

	}

}
