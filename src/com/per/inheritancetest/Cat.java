package com.per.inheritancetest;

public class Cat extends Animal{

	int name;
	int age;
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String type, int name, int age) {
		super(type);
		super.age="Test";
		this.name = name;
		this.age = age;
	}
	
	public Cat(int name, int age) {
		this.name = name;
		this.age = age;
	}

	public Cat(int name) {
		this.name = name;
	}

	public Cat(String type, int age) {
		super(type);
		this.age = age;
	}
	
	public String getType() {
		return type;
	}
	
	
}
