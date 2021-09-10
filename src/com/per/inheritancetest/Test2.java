package com.per.inheritancetest;

interface anmial{

	public static final int x=5;
	public String getData();
	default String data() {
		return "Hello";
	}
}

abstract class BaseClass{
	abstract String getTest() throws Exception;
}

class Subclass extends BaseClass{
	String getTest() throws Exception{
		try {
		throw new Exception("Something went wrong");
		} catch(Exception e) {
			System.out.println("Dont come here");
		}
		return "Passed";
	};
}

public class Test2 extends Subclass{

	String getTest() {
		return "A";
	}
	
	public Test2() {
	}
	
	public static void main(String [] args) {
		Subclass s = new Test2();
		try {
			System.out.println(s.getTest());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
