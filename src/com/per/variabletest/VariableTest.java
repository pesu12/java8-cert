package com.per.variabletest;

import java.util.ArrayList;

public class VariableTest {

	private static int instanceInt =5;
	static char instanceChar='C';
	protected static double instanceDouble=5.0;	
	public static Integer instanceInteger=6;
	private static String instanceString="Hello";
	static Object instanceObject= new Object();
	protected static ArrayList<String> instanceArrayList;		
	public static StringBuilder b = new StringBuilder();
	//private static final String monday; a final variable must be initialized.
	//final int end;
	
	public VariableTest() {
		//end=5;
	}
	
	{
		instanceInt =6;
	}
	
	static {
		instanceInt =8;
	}
	
	static int a,y,c;
	
	public static final void main(String[] args) {
	
		final int localInt;
		String localString;
		Object localObject;
		
		instanceInt=3;
		//VariableTest v = new VariableTest();
		
		System.out.println(instanceInt + " for instance variable int");
		System.out.println(instanceChar + " for instance variable char");		
		System.out.println(instanceDouble + " for instance variable double");		
		System.out.println(instanceInteger + " for instance variable Integer");		
		System.out.println(instanceString+ " for instance variable String");		
		System.out.println(instanceObject+ " for instance variable Object");		
		System.out.println(instanceArrayList+ " for instance variable ArrayList");		
		System.out.println(b+ " for instance variable StringBuilder");		
		//System.out.println(localInt);
		//System.out.println(localString);
		//System.out.println(localObject);
		
		//String x = instanceString.charAt(2);
		//b.r
		//System.out.println(x);
		
		System.out.println(a +" " + y );
	}
	
	

}
