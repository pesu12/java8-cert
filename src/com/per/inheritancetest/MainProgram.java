package com.per.inheritancetest;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d = new Cat();
		//System.out.println(d.getType());
		
		((Cat) d).name =5;
		Cat y = (Cat) d;
		System.out.println(y.type);
	}

}
