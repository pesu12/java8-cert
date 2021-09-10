package com.per.practisechapter10;

public class Quest48Highway {

	public int drive(long car) {return 2;}
	public int drive(double car) {return 3;}
	public int drive(int car) {return 5;}
	public int drive(short car) {return 3;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//short value =5;
		//byte value = 5;
		double value = 5;
		
		System.out.println(new Quest48Highway().drive(value));
	}

}
