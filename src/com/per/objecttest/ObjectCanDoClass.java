package com.per.objecttest;

import java.util.ArrayList;

public class ObjectCanDoClass {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add("Test");
		
		System.out.println(a);
		
		Object b = a;
		System.out.println(b);		
		a.add("Test2");
		//b.add("test"); //Not possible
		System.out.println(b.equals(a));
		System.out.println(a);
		System.out.println(b);		
	}

}
