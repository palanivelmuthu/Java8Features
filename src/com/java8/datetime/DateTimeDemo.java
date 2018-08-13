package com.java8.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println("Date : "+d);
		
		LocalTime t = LocalTime.now();
		System.out.println("Time : "+t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Date & Time : "+dt);
		
		LocalDateTime dtz = LocalDateTime.now(ZoneId.of("Indian/Chagos"));
		System.out.println("Date & Time : "+dtz);
		
		Instant i = Instant.now();
		System.out.println("DateTime with GMT : "+i);
		
		/*ZoneId.getAvailableZoneIds();
		for(String s : ZoneId.getAvailableZoneIds()){
			System.out.println(s);
		}*/
		
	}

}
