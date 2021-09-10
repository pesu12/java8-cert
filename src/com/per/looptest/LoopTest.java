package com.per.looptest;

public class LoopTest {

	public static void main(String[] args) {
		long x = 0, y = 0;
		for (int z = 4; x < 5 && y < 10; x++, y++) {
			System.out.println("x= " + x);
			System.out.println("y= " + y);
		}
		System.out.println("=================");
		// x=5,y=5
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}

}
