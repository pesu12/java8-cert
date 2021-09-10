package com.per.staticinittest;

public class StaticInitTest {

	private static final int X;
	private static int Y;
//	private static final String bench;
	//private static final int Z; If static variable is declared then it must be assigned. 
	
	static {
		X=5;
	//	Y=2;
	}
	
	static {
		//X=4; Not allowed
	//	Y=3;
	}
	
	public static void main(String[] args) {
		Y=4;  //X changed with local variable => result Y=4
		System.out.println(X+" "+Y);
	//	bench ="bench";
		
	}
}
