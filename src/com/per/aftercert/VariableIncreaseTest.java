package com.per.aftercert;

public class VariableIncreaseTest {

	public VariableIncreaseTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		int x = (a <= b) ? 5 : 4;
		System.out.println(x);
	}
}
