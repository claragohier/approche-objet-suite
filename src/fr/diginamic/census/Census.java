package fr.diginamic.census;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Census {

	private List<City> cities;
	
	public Census(List<String> lines) {
		this.cities = new ArrayList<City>();
		
		List<Region> regionsList = new ArrayList<Region>();
		List<Department> depList = new ArrayList<Department>();
		
		int regionCode = 0;
		String depCode = null;
		Region region = null;
		Department dep = null;
		
		String header = "Code région;Nom de la région;Code département;Code arrondissement;Code canton;Code commune;Nom de la commune;Population municipale;Population comptée à part;Population totale;";
		
		for(String line : lines) {
			
			if(!line.equals(header)) {
				line = line.trim().replaceAll(" ", "");
				String[] string = line.split(";");
				
				region = new Region(Integer.parseInt(string[0]), string[1]);
				regionsList.add(region);

//				dep = new Department(depCode, region);
				
//				System.out.println(regionsList.indexOf(region));
				
//				for(Region reg : regionsList) {
////					System.out.println(reg.getRegionCode() + "  " + region.getRegionCode());
//					if(reg.getRegionCode() == region.getRegionCode()) {
//						System.out.println(reg + " " + region);
//						regionsList.remove(region);
//						region = reg;
//					}
//				}
				
				Iterator<Region> it = regionsList.iterator();
				while(it.hasNext()) {
					Region reg = it.next();
					if(reg.getRegionCode() != region.getRegionCode()) {
						System.out.println(reg.getRegionCode());

						continue;
					} else {
//						System.out.println(reg.getRegionCode());
						it.remove();
//						System.out.println(reg);
						region = reg;
//						System.out.println(region);
					}
				}


//				if(depList.indexOf(dep) != -1) {
//					dep = depList.get(depList.indexOf(dep));
//				}

				
				//				
//				regionCode = Integer.parseInt(string[0]);
//				depCode = string[2];
//								
//				City city = new City(dep, Integer.parseInt(string[5]), string[6], Integer.parseInt(string[9]));
//				cities.add(city);
				
				for(Region reg : regionsList) {
					System.out.println(reg.getRegionName() + reg.getRegionCode());
				}
			}	
		}

	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

}
