package com.per.varargtest;

import java.util.Arrays;

public class VarArgTest {

	public static void main(String[] args) {
		jump (1,new int[]{1,2,3});
		jump (1);

	}
	
	static void jump(int number1,int...numbers){
		System.out.println(number1);
		System.out.println(Arrays.toString(numbers));
	}

}
