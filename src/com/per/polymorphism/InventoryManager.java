package com.per.polymorphism;

public class InventoryManager {
	
	private Automobile featuredAuto;
	
	/*
	public void addAutomobile(Car c) {
		System.out.println("Adding car #"+ c.getVIN());
	}
	
	public void addAutomobile(Truck c) {
		System.out.println("Adding car #"+ c.getVIN());
	}
	*/
	
	public void addFeaturedAuto(Automobile auto) {
		featuredAuto = auto;
	}
	
	public void addAutomobile(Automobile c) {
		System.out.println("Adding car #"+ c.getVIN());
	}
	
}
