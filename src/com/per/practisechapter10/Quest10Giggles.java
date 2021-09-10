package com.per.practisechapter10;

public class Quest10Giggles {

	public static void main(String[] args) {
		String lol ="lol";
		//true due to same adress
		System.out.println(lol==lol);
		//false due to that a new string is returnred		
		System.out.println(lol.toUpperCase()==lol);
		System.out.println(lol.toUpperCase()==lol.toUpperCase());
		System.out.println(lol.toUpperCase().equals(lol.toUpperCase()));
	}

}
