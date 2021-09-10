package com.per.aftercert;

import java.util.ArrayList;

public class ArrayListIntNullTest {

	public static void main(String[] args) {
		ArrayList <Integer>l1= new ArrayList<>();
		l1.add(1);
		l1.add(null);
		System.out.println(l1.get(1));
		l1.add(2);
		l1.add(3);
		l1.remove(null);
		System.out.println(l1.get(1));
	}

	
	
}
