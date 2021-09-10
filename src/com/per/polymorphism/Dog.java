package com.per.polymorphism;

public class Dog extends Animal{

	String name;
	String color;

	/*
	public String getName() {
		System.out.println("Getting dog name");
		//System.out.println(super.getName());
		return name;
	}
	*/
	
	public void setName(String name) {
		this.name = name;
		System.out.println("Setting dog name");
	}
	
	public void printName() {
		System.out.println(this.name);
	}
	
}
