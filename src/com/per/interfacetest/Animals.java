package com.per.interfacetest;

public abstract interface Animals {

	public abstract void addName(String name);
	
	public static final int CONST_X = 5;

	
	static void deleteName(String name) {
		return;
	}
	
	default void checkName(String name) {
		return;
	}
	
	public static void deleteName2(String name) {
		return;
	}
	
	public default void checkName2(String name) {
		return;
	}

	void checkName3(String name);	
	
}
