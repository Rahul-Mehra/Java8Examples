
package com.rahulmehra.java8.datetimeapi;

import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate now,bdate,oneMonthPlus,nextTue;

		now =LocalDate.now();
		System.out.println(now);
		
		bdate = LocalDate.of(1992,9,1);
		System.out.println("bday -> "+bdate);
		System.out.println("bday was before -> "+bdate.isBefore(now));
		System.out.println("bday was in leap year -> "+bdate.isLeapYear());
		System.out.println("bday day of week -> "+bdate.getDayOfWeek());
		
		oneMonthPlus = now.plusMonths(1);
		System.out.println("date from a month from now -> "+oneMonthPlus);
		
		nextTue = bdate.with(next(TUESDAY));
		System.out.println("nect tues after bday -> "+nextTue);
		

	}
}
