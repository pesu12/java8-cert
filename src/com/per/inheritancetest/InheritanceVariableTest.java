package com.per.inheritancetest;

class Math {
	
	public static double secret = 2;
	{
		secret=3;
	}
}

class ComplexMath extends Math {
	public double secret = 4;
}

public class InheritanceVariableTest extends ComplexMath{

	public double secret = 8;
	
	
	public static void main(String[] args) {
		Math math = new InheritanceVariableTest();
		System.out.println(math.secret);
		
		ComplexMath complexMath = new ComplexMath();
		System.out.println(complexMath.secret);
		
		Math math2 = new ComplexMath();
		System.out.println(math2.secret);
		System.out.println(((ComplexMath)math2).secret);		
		
		InheritanceVariableTest instVarTest = new InheritanceVariableTest();
		System.out.println(instVarTest.secret);	
	}

}
