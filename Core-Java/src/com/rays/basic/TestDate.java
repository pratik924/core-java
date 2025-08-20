package com.rays.basic;

import java.time.LocalDate;

public class TestDate {
	public static void main(String[]args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getYear());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfYear());
		 
		System.out.print("--------");
		LocalDate dob = LocalDate.of(2002, 9 , 30);
	}

}
