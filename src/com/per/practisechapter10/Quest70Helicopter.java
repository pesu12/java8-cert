package com.per.practisechapter10;

public class Quest70Helicopter {

	public int adjustPropeller(int length, String[]type) {
		length++;
		type[0]="Long";
		return length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Quest70Helicopter h = new Quest70Helicopter();
		int length = 5;
		String[] type = new String[1];
		length = h.adjustPropeller(length, type);
		System.out.println(length+","+type[0]);
	}

}
