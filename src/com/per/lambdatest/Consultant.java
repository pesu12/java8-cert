package com.per.lambdatest;

public class Consultant implements Payable{

	public double salary = 80_000_00;
	@Override
	public double raiseSalary(double percentage) {
		// TODO Auto-generated method stub
		return salary + (salary * percentage);
	}

}
