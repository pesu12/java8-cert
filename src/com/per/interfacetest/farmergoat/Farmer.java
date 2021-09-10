package com.per.interfacetest.farmergoat;

public class Farmer implements Describable{

	private String description;
	
	public Farmer(String name) {
		description = "A farmer named " + name;
	}
	
	public String getDescription() {
		return description;
	}
}

