package fr.diginamic.census;

public class Region {
	
	private int regionCode;
	private String regionName;

	public Region(int regionCode, String regionName) {
		this.regionCode = regionCode;
		this.regionName = regionName;
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
}
