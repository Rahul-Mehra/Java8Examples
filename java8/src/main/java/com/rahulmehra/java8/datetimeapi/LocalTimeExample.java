package com.rahulmehra.java8.datetimeapi;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.*;

public class LocalTimeExample {

	public static void main(String[] args) {
		
		LocalTime now,nowPlus, nowHrsMin, lunch,bedtime;
		
		now = LocalTime.now();
		System.out.println("now -> "+now);
		
		nowPlus = now.plusHours(1).plusMinutes(15);
		System.out.println("now plus 1 hour 15 minutes -> "+nowPlus);
		
		nowHrsMin = now.truncatedTo(MINUTES);
		System.out.println("now in minutes -> "+nowHrsMin);
		
		lunch = LocalTime.of(17, 0);
		System.out.println("MINUTES left for lunch ->"+now.until(lunch, MINUTES));
		
		bedtime = LocalTime.of(22, 0);
		System.out.println("HOURS left for bedtime ->"+now.until(bedtime, HOURS));
	}
}
