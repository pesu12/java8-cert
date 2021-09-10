package com.per.practisechapter10;

public class Quest21Alligator {

	static int teeth;
	double scaleToughness;
	
	public Quest21Alligator() {
		teeth++;
	}
	
	//Overwriting static teeth with local teeth.
	public void snap(int teeth) {
		System.out.println(teeth + " ");
		teeth--;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quest21Alligator().snap(teeth);
		new Quest21Alligator().snap(teeth);
	}
}
