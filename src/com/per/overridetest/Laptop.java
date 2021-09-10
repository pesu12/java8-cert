package com.per.overridetest;

class Computer {
	private final int process() {return 5;}
}

public class Laptop extends Computer{

	public final int process() {return 3;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
