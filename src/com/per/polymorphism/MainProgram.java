package com.per.polymorphism;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		////////////////////////
		Animal D = new Dog();
		D.setNumberOfLegs(4);
		D.name="Test";
		System.out.println(D.getName());
		//D.color = "Black"; //Not possible to access subclass variables.
		((Dog) D).color ="Grey"; //temporarily possible to access subclass variables
		Dog Y = (Dog) D;
		Y.color ="Black"; //Possible after cast.
		Y.setName("Pelle");
		System.out.println(Y.getName());
		
		//D.printName();
		
		Cat cat = new Cat();
		//Cast up , is done without (Animal)
		Animal animal = cat;
		
		//Cast up , is done with (Cat)
		cat = (Cat)animal;
	}

}
