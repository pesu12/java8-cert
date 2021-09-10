package com.per.casttest;

class A {
	
	public String whoAmI() {
		return "ClassA";
	}
	
	public String specialClassAMethod() {
		return "ClassA only method";
	}
}

class B extends A {
	
	public String whoAmI() {
		return "ClassB";
	}
	
	public String specialClassBMethod() {
		return "ClassB only method";
	}
}


public class Casttest {

	public static void main(String[] args) {
		B obj1 = new B();
		A obj2 = new B();
		A obj3 = new A();		

		System.out.println("Obj1: " + obj1.whoAmI());
		System.out.println("Obj2: " + obj2.whoAmI());
		System.out.println("Obj3: " + obj3.whoAmI());	
		
		
		//System.out.println("obj2: " + obj2.specialClassBMethod());
		B obj4 =(B) obj2;
		System.out.println("obj4: " + obj4.specialClassBMethod());
		System.out.println("obj2: " + ((B)obj2).specialClassBMethod());
		
		//Class cast exception, to reach method object or instance must be done.
		//System.out.println("obj3: " + ((B)obj3).specialClassBMethod());
	}

}
