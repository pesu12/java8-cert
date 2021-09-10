package com.per.polymorphism;

public class Automobile {

	private static int vinCount = 3_818_202;
	protected int VIN;
	
	public int getVIN() {
		return VIN;
	}
	
	public Automobile() {
		VIN= vinCount++;
	}
}
