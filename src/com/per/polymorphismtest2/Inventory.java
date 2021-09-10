package com.per.polymorphismtest2;

import java.util.ArrayList;

import wordTest.WordNoun;

public class Inventory {

	ArrayList<Animal> animals= new ArrayList<Animal>();
	ArrayList<String> types = new ArrayList<String>();
	
	
	public void addAnimal(Animal animal) {
		animal.addAnimal();
		
		animals.add(animal);
		System.out.println(animal.getClass().getSimpleName());
	}
	
	public void displayInventory() {
		for(String type: types){
			System.out.println(types);
		}
	}

	public void addWord(WordNoun n) {
		// TODO Auto-generated method stub
		
	}
}
