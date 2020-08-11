package com.rahulmehra.java8.datetimeapi;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.time.Month.*;
import static java.time.temporal.ChronoUnit.*;
import java.time.LocalDate;

public class localDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime meeting, flight, courseStart,courseEnd;
		
		meeting = LocalDateTime.of(2020, AUGUST,25,11,15);
		System.out.println("meeting date -> "+meeting);
		
		LocalDate flightDate = LocalDate.of(2020, 8, 26);
		LocalTime flightTime = LocalTime.of(23, 30);
		flight = LocalDateTime.of(flightDate, flightTime);
		System.out.println("flight date and time -> "+flight);
		
		courseStart = LocalDateTime.of(2020,AUGUST,15,9,0);
		courseEnd = courseStart.plusDays(4).plusHours(8);
		
		System.out.println("course start date -> "+courseStart);
		System.out.println("course end date -> "+courseEnd);
		
		long courseDuration = (courseEnd.getHour() - courseStart.getHour())*(courseStart.until(courseEnd, DAYS) +1);
		System.out.println("course duration -> "+courseDuration);
	}

}
