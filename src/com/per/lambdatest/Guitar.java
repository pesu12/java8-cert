package com.per.lambdatest;

public class Guitar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strummable instrument = () -> { System.out.println("Strummed");};
		instrument.strum();
		}

	interface Strummable{
		void strum();
	}
}
