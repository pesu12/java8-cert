package com.per.practisechapter10;

import java.time.LocalDate;

public class Quest76OnePlusOne {

	public Quest76OnePlusOne() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate time = LocalDate.of(1, 11);
		while(time.getHour()<1) {
			time.plusHours(1);
			System.out.println("in loop");
		}

	}

}
