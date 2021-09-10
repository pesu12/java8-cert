package com.per.predicatetest;

import java.util.function.Predicate;

public class MainProgram {

	static //Predicate<String> p = (String b) -> {String b="4";return true;}; Will not compile, b is declared 2 times.
	//Predicate dash = c -> c.startsWith("-"); Will not compile, Predicate is on object but .startsWidth is not in object.
	Predicate clear = c -> c.equals("grey");
	
	public static void main(String[] args) {
		//Predicate<String> pred = (String args) -> true; will not compile , args is declared 2 times.
		System.out.println(clear.test("pink"));
	}
}
