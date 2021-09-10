package com.per.inheritancetest;

public class Animal {

	String type;
	String age;
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Animal(String type) {
		this.type = type;
	}

	public Animal() {
		this("Cat");
		// TODO Auto-generated constructor stub
	}	
}
