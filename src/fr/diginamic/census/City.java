package fr.diginamic.census;

public class City {
	private Department dep;
	private int cityCode;
	private String cityName;
	private int totalPop;
	
	public City(Department dep, int cityCode, String cityName, int totalPop) {
		this.dep = dep;
		this.cityName = cityName;
		this.totalPop = totalPop;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
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

	public int getTotalPop() {
		return totalPop;
	}

	public void setTotalPop(int totalPop) {
		this.totalPop = totalPop;
	}

}
