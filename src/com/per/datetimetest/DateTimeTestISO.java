package com.per.datetimetest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DateTimeTestISO {

	public static void main(String[] args) {
		new DateTimeTestISO();
	}
	
	public DateTimeTestISO() {
		ArrayList<DateTimeFormatter> ldtList= new ArrayList<>();
		ldtList.add(DateTimeFormatter.BASIC_ISO_DATE);
		ldtList.add(DateTimeFormatter.ISO_LOCAL_TIME);
		ldtList.add(DateTimeFormatter.ISO_LOCAL_DATE);
		ldtList.add(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		ldtList.add(DateTimeFormatter.ISO_TIME);
		ldtList.add(DateTimeFormatter.ISO_DATE);
		ldtList.add(DateTimeFormatter.ISO_DATE_TIME);
		ldtList.add(DateTimeFormatter.ISO_ORDINAL_DATE);
		
		LocalDateTime ldt = LocalDateTime.now();
		ldtList.forEach(c -> {
			System.out.println(ldt.format(c));
		});
	}
}
