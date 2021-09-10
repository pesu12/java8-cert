package com.per.overridetest;

class Television {
	protected Object playMusic() throws Throwable{
		System.out.println("Play");
		return null;
	}
	
	//Overloading is done in the same class.
	public Integer playMusic(int x) {
		System.out.println(5);
		return 0;
	}
}

public class LCD extends Television {
	//Overriding is done in overrides
	//Access Modifier is bigger
	//Exception is smaller
	//Return value is allowed to be smaller if it is a non-primitive value (covariant). 
	public Integer playMusic() throws Exception{
		System.out.println(5);
		return 0;
	}
}
