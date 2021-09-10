package com.per.datetimetest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeTest {
	static public void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		LocalDate ld1 = LocalDate.of(2021,8,20);
		Period p = Period.of(0,1,1);
		LocalDate ld2 = ld1.plus(p);
		System.out.println(ld2);
		
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(ld2.format(dtf));
        System.out.println(ld2.getDayOfMonth());
        
        System.out.println(Period.between(ld1, ld2));
        
        LocalDateTime ldt = LocalDateTime.now();
        long nanosec = ldt.getNano();
        long nanosec2 = ldt.getNano();
        System.out.println(nanosec);
	}
}
