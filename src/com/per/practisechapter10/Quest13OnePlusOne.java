package com.per.practisechapter10;

import java.time.LocalTime;

public class Quest13OnePlusOne {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(1, 11);
		while(time.getHour()<1) {
			time.plusHours(1);
			System.out.println("in loop");
		}
	}
}
