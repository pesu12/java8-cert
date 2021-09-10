package com.per.excpetiontest;

public class CertBookExceptionTest {

	public static void main(String[] args) {
		new CertBookExceptionTest();
	}
	
	public CertBookExceptionTest() {
		testMethod1();
	}
	
	public static void testMethod1() {
		try {
			testMethod2();
		} catch (ArithmeticException ae){
			System.out.println("Dock");
		}
	}
	
	public static void testMethod2() throws ArithmeticException{
		try {
			testMethod3();
		} catch(ArithmeticException ae){
			System.out.println("Dickory");
		}
	}
	
	public static void testMethod3() throws ArithmeticException {
		throw new ArithmeticException();
		//System.out.println("Hickory");
	}

}
