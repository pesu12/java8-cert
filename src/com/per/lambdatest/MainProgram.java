package com.per.lambdatest;

public class MainProgram {

	public static void main(String[] args) {
		Consultant x = new Consultant();
		double salary = 75_000;
		cutcheck(
		(double percentage) -> {return salary;}
			
		);
	}
	
	public static void cutcheck(Payable p) {
		double updateSalary = p.raiseSalary(.04);
	}
}
