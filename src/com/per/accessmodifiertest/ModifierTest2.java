package com.per.accessmodifiertest;

public class ModifierTest2 {

	public static void main(String[] args) {
		ModifierTest.testDefault();
		ModifierTest.testProtected();
		ModifierTest.testPublic();
		
		System.out.println(ModifierTest.pubInt);
		//System.out.println(ModifierTest.privInt);	
		System.out.println(ModifierTest.protInt);
		System.out.println(ModifierTest.defInt);			
	}

}
