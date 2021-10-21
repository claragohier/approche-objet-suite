package fr.diginamic.testenumeration;

public enum Season {

	SPRING("Spring", 1), SUMMER("Summer", 2), AUTUMN("Autumn", 3), WINTER("Winter", 4);

	private String label;
	private int number;

	private Season(String label, int number) {
		this.label = label;
		this.number = number;
	}

	public String getLabel() {
		return label;
	}

	public int getNumber() {
		return number;
	}

	public static Season getInstance(String label) {
		for (Season item : Season.values()) {
			if (label.equals(item.getLabel())) {
				return item;
			}
		}
		
		return null;
	}

}
