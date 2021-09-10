package com.per.interfacetest;

public class MainProgInterface implements Animals{

	public static void main(String[] args) {
		MainProgInterface mp = new MainProgInterface();
		mp.addName("Per");
		
		Animals animals = new MainProgInterface();
		//Deletename is of type statc making it a class-method.
		Animals.deleteName("Per");
		//Checkname is of type default making it an instance-method.		
		animals.checkName("Per");
		System.out.println(Animals.CONST_X);
	}

	@Override
	public void addName(String name) {
		System.out.println("Name is " + name);	
	}

	@Override
	public void checkName3(String name) {
		// TODO Auto-generated method stub
		
	}
}
