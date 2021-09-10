package com.per.aftercert;

public class WhileLoopTest {

	public static void main(String[] args) {
		int x = 0;
		do {
			++x;
			System.out.println(x);
		}while (x<5);
		
		System.out.println("\n");
		
		x = 0;
		do {
			++x;
			System.out.println(x);
		}while (x<=5);
		
		System.out.println("\n");
		
		x=0;
		while(x<5) {
			++x;
			System.out.println(x);
		}
		
		System.out.println("\n");
		
		x=0;
		while(x<=5) {
			++x;
			System.out.println(x);
		}
		
	}

}
