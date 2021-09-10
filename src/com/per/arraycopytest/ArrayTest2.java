package com.per.arraycopytest;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] a = {"A","B","C"};
		String b[] = new String[] {"C","D"};
		
		System.arraycopy(a, 0, b, 0, 2);
		
		for(String c :b) {
			System.out.println(c);
		}
	}
}
