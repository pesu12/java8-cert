package com.per.abstractclasstest;

public class MainSubClass extends AbstractClass{

	public static void main(String[] args) {
		
		MainSubClass ms = new MainSubClass();
		ms.setName("Per");
		ms.printName();
	}

	@Override
	public void setName(String name) {
		super.name= name;;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}
}
