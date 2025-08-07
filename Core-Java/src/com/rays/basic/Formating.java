package com.rays.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Formating {
	

	private static String formatedDate;

	public static void main(String[]args) {
		
		
		Date date= new Date();
		
		System.out.println("default format:"+ date);
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd" );
		String formateDate = sdf.format(date);
		System.out.println("my format:"+ formateDate);
		
	}
	

}
