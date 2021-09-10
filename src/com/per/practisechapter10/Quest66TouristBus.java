package com.per.practisechapter10;

public class Quest66TouristBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nycTourLoops= new String[] {"Downtown", "Uptown","Broklyn"};
		String[] times = new String[] {"Day", "Night"};
		for(int i=0, j=0;i < nycTourLoops.length;i++,j++)
			System.out.println(nycTourLoops[i]+ " " + times[j]);
	}

}
