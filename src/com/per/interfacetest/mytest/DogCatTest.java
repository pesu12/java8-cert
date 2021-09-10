package com.per.interfacetest.mytest;

public class DogCatTest {

	public static void main(String[] args) {
		new DogCatTest();
		
	}
	
	public DogCatTest() {
		Dog dog = new Dog();
		Animal animal = new Animal();
		
		System.out.println(checkType(animal));		
		System.out.println(checkType(dog));
	}
	
	public String checkType(Animal a) {
		return a.getType();
	}
	
}
