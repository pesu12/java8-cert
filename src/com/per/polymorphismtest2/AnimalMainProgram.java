package com.per.polymorphismtest2;

public class AnimalMainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory i= new Inventory();
		
		Dog d = new Dog();
		i.addAnimal(d);
		
		Dog e = new Dog();
		i.addAnimal(e);
		
		Cat f = new Cat();
		i.addAnimal(f);
	}
}
