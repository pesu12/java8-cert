package datetimeformating;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(2010, Month.APRIL, 15);
		LocalTime time = LocalTime.of(11,22,33);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

		DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		System.out.println(shortFormatter.format(dateTime));
		System.out.println(mediumFormatter.format(date));
		//System.out.println(shortFormatter.format(time));
		
		System.out.println("----------------------");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date2 = LocalDate.parse("02 15 2010", formatter);
		LocalTime time2 = LocalTime.parse("11:33");
		
		System.out.println(date2);
		System.out.println(time2);
		String text = date.format(formatter);
		System.out.println(text);
		
	}
}
