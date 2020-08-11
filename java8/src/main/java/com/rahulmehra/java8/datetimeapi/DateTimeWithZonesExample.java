package com.rahulmehra.java8.datetimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static java.time.Month.*;


public class DateTimeWithZonesExample {

	public static void main(String[] args) {

		ZoneId SFO = ZoneId.of("America/Los_Angeles");
		ZoneId BOS = ZoneId.of("America/New_York");
		
		LocalDateTime departure = LocalDateTime.of(2014,JUNE,15,22,30);
		ZonedDateTime departSfo = ZonedDateTime.of(departure, SFO);
		System.out.println("flight 121 departs from SFO at "+departSfo);
		
		ZonedDateTime departBos = departSfo.toOffsetDateTime().atZoneSameInstant(BOS);
		System.out.println("flight 121 depart time at BOS "+departBos);
		
		System.out.println("flight 121 duration: 5 hours 30 minutes");
		
		ZonedDateTime arrivalBOS = departSfo.plusHours(5).plusMinutes(30).toOffsetDateTime().atZoneSameInstant(BOS);
		System.out.println("flight 121 arrives boston at "+arrivalBOS);
		
		ZonedDateTime arrivalSFO = arrivalBOS.toOffsetDateTime().atZoneSameInstant(SFO);
		System.out.println("flight 121 arrives boston at "+arrivalSFO);
	}

}
