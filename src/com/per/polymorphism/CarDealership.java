package com.per.polymorphism;

public class CarDealership {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryManager manager = new InventoryManager();
		
		Car c = new Car();
		manager.addAutomobile(c);
		manager.addFeaturedAuto(c);
		
		Truck t = new Truck();
		manager.addAutomobile(t);
		
		Scooter s = new Scooter();
		manager.addAutomobile(s);
	}

}
