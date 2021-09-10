package com.per.abstractclasstest;

public  abstract class AbstractClass extends AbstractBaseClass{
	
	String type;
	String name;
	
	public AbstractClass(){
		System.out.println("Abstract class created.");
		type = "NoType";
		name = "";
	}
	
	abstract public void setName(String name);
	
	public void printName(){
		System.out.println("Name is "+name);
	}
	
	@Override
	public void setCategory(int category) {
		// TODO Auto-generated method stub	
	}
	
	//public String getCategory();

}
