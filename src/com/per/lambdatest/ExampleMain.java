package com.per.lambdatest;

import java.util.ArrayList;
import java.util.List;

public class ExampleMain {

	public static void main(String[] args) {

		//Zero parameters
		/*
		FunctionalInterface msg = () -> {
			return "Hello";
		};
		
		System.out.println(msg.sayHello());
		*/
		
		//One parameter
		/*
		FunctionalInterface f = (num) -> num +5;
		System.out.println(f.incrementByFive(22));
		*/
		
		FunctionalInterface s = (str1, str2) -> str1 + str2;
		System.out.println("Result "+ s.sconcat("Hello", "World"));

		List<String> list=new ArrayList<String>();  
	       list.add("Rick");         
	       list.add("Negan");       
	       list.add("Daryl");         
	       list.add("Glenn");         
	       list.add("Carl");                
	       list.forEach(          
	           // lambda expression        
	           (names)->System.out.println(names)         
	       );     
	}
}
