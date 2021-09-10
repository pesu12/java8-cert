package com.per.accessmodifiertest;

public class ModifierTest {
	
	public static int pubInt =1;
	private static int privInt =2;
	protected static int protInt =3;
	static int defInt =4;	

	public static void main(String[] args) {
		testPublic();
		testPrivate();
		testProtected();
		testDefault();
		
		System.out.println(pubInt);
		System.out.println(privInt);	
		System.out.println(protInt);
		System.out.println(defInt);			
	}
	
	public static void testPublic(){
		System.out.println("Public");
	}
	
	private static void testPrivate(){
		System.out.println("Private");
	}
	
	protected static void testProtected(){
		System.out.println("Protected");
	}
	
	static void testDefault(){
		System.out.println("Default");
	}
	

}
