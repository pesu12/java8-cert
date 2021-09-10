package com.per.stringtest;

public class TestString {

	public static void main(String[] args) {
		
		String str ="Tullinge";
		String str2= "Tullinge";
		String str3 = new String("Tullinge");
		System.out.println(str==str2);
		System.out.println(str.equals(str2));		
		System.out.println(str==str3);	
		System.out.println(str.equals(str3));			
		
	}

}
