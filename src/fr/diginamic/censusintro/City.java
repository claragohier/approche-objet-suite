package fr.diginamic.censusintro;

public class City implements Comparable<City> {

	private int regionCode;
	private String regionName;
	private String depCode;
	private int cityCode;
	private String cityName;
	private int pop;

	public City(int regionCode, String regionName, String depCode, int cityCode, String cityName, int pop) {
		this.regionCode = regionCode;
		this.regionName = regionName;
		this.depCode = depCode;
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.pop = pop;
	}

	// step 2
	public String toString() {
		return "region code : " + this.getRegionCode() + "\nregion name : " + this.getRegionName()
				+ "\ndepartment code : " + this.getDepCode() + "\ncity code : " + this.getCityCode() + "\ncity name : "
				+ this.getCityName() + "\ntotal population : " + this.getPop();
	}
	
	public int compareTo(City other) {
		if(this.getPop() > other.getPop()) {
			return 1;
		}
		if(this.getPop() < other.getPop()) {
			return -1;
		}
		
		return 0;
	}

	public int getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(int regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPop() {
		return pop;
	}

	public void setPop(int pop) {
		this.pop = pop;
	}

}
