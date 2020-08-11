package com.rahulmehra.java8.datetimeapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {

			String dateFormat = "dd-MMM-yyyy";
			String date = "01-Sep-2020";
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
			
			LocalDate aDate = LocalDate.parse(date,formatter);
			

			Period between;
				if(aDate.isBefore(LocalDate.now())) {
					between = Period.between(aDate, LocalDate.now());
				}else {
					between = Period.between(LocalDate.now(),aDate);
				}
				
			int year = between.getYears();
			int month = between.getMonths();
			int day = between.getDays();
			
			System.out.println("there are "+year+" years, " +month+"months,"+day+"days between the 2 dates");
	}

}
