package com.per.arraystringmethodparamtest;

public class StringArrayCallTest {

	public static void main(String[] args) {
		String[] val1 = new String[] {"TEST"};
		getValueBack(val1);
		//Array String is affected by method.
		System.out.println(val1[0].toString());
		
		int[] val3 = new int[] {1};
		getValueBack(val3);
		//Array int is affected by method.
		System.out.println(val3[0]);
		
		
		String val2 = "TEST2";
		getValueBack2(val2);
		//Arrays String is not affected by method.
		System.out.println(val2);
	}
	
	private static void getValueBack(int[] val3) {
		// TODO Auto-generated method stub
		val3[0]=3;		
	}

	private static void getValueBack2(String val2) {
		// TODO Auto-generated method stub
		val2="Test2";	
	}

	public static void getValueBack(String... value) {
		value[0]="Test";
	}

}
