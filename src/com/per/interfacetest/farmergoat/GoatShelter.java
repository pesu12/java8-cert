package com.per.interfacetest.farmergoat;

public class GoatShelter implements Describable{

	private String description;
	private int height;
	private int width;
	private int length;
	
	public GoatShelter(int height, int width, int lenght) {
		this.height = height;
		this.width = width;
		this.length = lenght;
		this.description = "A goat shelter is height: " + height;
	}
	
	public String getDescription() {
		return description;
	}
}
