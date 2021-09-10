package com.per.inheritancetest;

class A{
	public A(int a){
		System.out.println("A");
	}
	
	public A(){
		System.out.println("A");
	}
}

class B extends A{
	
	public B(int b) {
		System.out.println("b");
	}
	public B(){
		super();
		//super(5);
		System.out.println("B");
	}
	
	public void setChar() {
		//this.B(); can only be set in constructor, not in regular methods.
		//super();  can only be set in constructor, not in regular methods.
	}
}

public class SuperTest {

	public static void main(String[] args) {
		B b = new B();
	}

}
