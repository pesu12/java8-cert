package com.per.polymorphismtest2;

public class Animal {

	static int numberOfAnimals =0;
	
	public Animal() {
	}
	
	public void addAnimal() {
		numberOfAnimals++;
	}

	public static int getNumberOfAnimals() {
		return numberOfAnimals;
	}
	
}

