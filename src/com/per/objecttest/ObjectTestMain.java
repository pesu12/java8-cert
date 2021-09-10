package com.per.objecttest;

class TestObject{
	
	String str = "TestObject";
	
	public TestObject() {
		System.out.println("Creating test-object");
	}
	
	public TestObject(String str) {
		this.str = str;
		System.out.println("Creating test-object with str");
	}
	
	public String toString() {
		return "str " + str;
	}
}

public class ObjectTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestObject obj = new TestObject("T1");
		TestObject obj2 = new TestObject("T1");		
		System.out.println(obj.toString().equals(obj2.toString()));
	}

}
