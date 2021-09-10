package com.per.operatortest;

public class OperatorIncreaseAndPlus {

	public static void main(String[] args) {
		int i2 = 100; int j2= 200;
		if ((i2==99)&& (--j2==199)) {
			System.out.println("Value1: " + (i2+j2) + " ");
		} else {
			System.out.println("Value 2: " +(i2 + j2) + " ");
		}
		

		i2 = 100; j2= 200;
		if ((i2==99) & (--j2==199)) {
			System.out.println("Value1: " + (i2+j2) + " ");
		} else {
			System.out.println("Value 2: " +(i2 + j2) + " ");
		}
	}

}
