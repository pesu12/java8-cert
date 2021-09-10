package com.per.interfacetest.farmergoat;

public class TestGoat {
	
	public static void main(String[] args) {
		new TestGoat();
	}
	
	public TestGoat() {
	Goat goat = new Goat("Bob");
	Farmer farmer = new Farmer("Hans");
	GoatShelter goatShelter = new GoatShelter(4, 4, 6);
	System.out.println(description(goat));
	System.out.println(description(goatShelter));
	System.out.println(description(farmer));
	}
	
	//True Describable object is impossible since its an interface
	//But However classes that implements Describable can create objects.
	private String description(Describable d) {
		return d.getDescription();
	}
}
