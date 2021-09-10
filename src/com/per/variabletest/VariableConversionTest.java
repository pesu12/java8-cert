package com.per.variabletest;

public class VariableConversionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x = 0.1f;
		long z = 2;
		x = x+z;
		System.out.println(x);
		short a = 2;
		short b = 4;
		int c = a+b;
		double d = c;
		//float e =d; //Cannot convert from double to float
		//long g = d; //Cannot convert from double to long
		//short x = c; //Cannot convert form int to short
		//int h = g;  //Cannot convert from long to int
	}

}
