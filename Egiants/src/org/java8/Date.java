package org.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("E, MMM d yyyy");
		String date="Tue, Aug 16 2016";
		
		LocalDate localdate=LocalDate.parse(date,formatter);
		
		System.out.println(localdate);
		
		LocalDate date1= LocalDate.parse(date);
		System.out.println(date1);
		
	}
	
}
