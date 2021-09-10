package com.per.arraycopytest;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cartypes = {"Volvo","Saab","Audi"};
		String[] newCarTypes = new String[2];
		
		//Length 2 is number of elements to be copied
		System.arraycopy(cartypes, 1, newCarTypes, 0, 2);
		for(String s: cartypes) {
			System.out.println(s);
		}
		System.out.println("-------------");
		for(String s: newCarTypes) {
			System.out.println(s);
		}
	}

}
