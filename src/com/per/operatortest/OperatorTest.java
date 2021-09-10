package com.per.operatortest;

public class OperatorTest {

	public static void main(String[] args) {
		int intVale = 15;
		double doubleValue = 5.3;
		
		int testDoule = intVale + (int) doubleValue;
		System.out.println(testDoule);

		//------------------------------------------
		//If value is between 127 and -127 then it is a primitive
		Integer myInteger = 127;   //Setting primitive values
		Integer myAnotherInteger = 127;  //Primitive values
		System.out.println(myInteger == myAnotherInteger);
		
		//If value is below -128 and over 127 then it is a object.
		myInteger = 128;
		myAnotherInteger = 128;
		System.out.println(myInteger == myAnotherInteger);	
		//equals
		System.out.println(myInteger.equals(myAnotherInteger));
		
		
		short x = 5;
		short y = 4;
		//Answer must be of type int or more.
		//short z = x+y;  
	}

}
