package fr.diginamic.census;

public class Department {

	private String depCode;
	private Region region;
	
	public Department(String depCode, Region region) {
		this.depCode = depCode;
		this.region = region;
	}

	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
}
