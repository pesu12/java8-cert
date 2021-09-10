package com.per.polymorphism;

public class Animal {

	int numberOfLegs;
	
	String name;
	
	public void setNumberOfLegs(int legs){
		this.numberOfLegs = legs;
	}
	
	public final int getNumberOfLegs(){
		return numberOfLegs;
	}
	
	public final String getName() {
		System.out.println("Getting animal name");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setting animal name");
	}
}
