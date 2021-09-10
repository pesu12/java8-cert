package com.per.inheritancetest;

class X{
	public void getTest(){
		System.out.println("Get test from base-class");
	}
	
	public void getTest2(){
		System.out.println("Get test from base-class");
	}
}

class Y extends X{

	//Override, exact same method
	public void getTest(){
		System.out.println("Get test from child-class");
	}
	
	public void getTest2(){
		super.getTest2();
	}
}

public class Test3 {

	public static void main(String[] args) {
		Y y = new Y();
		y.getTest();
		y.getTest2();
	}

}
