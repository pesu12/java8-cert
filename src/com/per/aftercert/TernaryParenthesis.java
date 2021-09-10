package com.per.aftercert;

public class TernaryParenthesis {

	
	
	public static void main(String[] args) {
		int a = 5<3? 1:2<1?4:5;
		System.out.println(a);
		
		int x = 5;
		System.out.println( x>2? x<4? 10 : 8 : 7 );
		System.out.println( x>2? (x<4? 10 : 8) : 7 );	
		
		printB("tRuE");
        printB("false");
        
        
	}
	
	 public static void printB(String str) {
		    //Equals to ignoring case....
	        System.out.print(Boolean.valueOf(str) ? "true" : "false");
	    }
}
