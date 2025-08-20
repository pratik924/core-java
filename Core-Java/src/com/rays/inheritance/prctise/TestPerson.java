package com.rays.inheritance.prctise;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		Student s = new Student();
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
		s.setName("pratik");
		s.setAddress("indore");
       s.setDob(sdf.parse("30-09-2002"));		
		s.setRollnumber("0827CA21DD43");
		s.setMarks(8);
		
		System.out.println("name: "+s.getName()+"\n"+ "Address: "+ s.getAddress()+ "\n" + "Dob:" + s.getDob()+ "\n"+ "RollNo. :"+s.getRollnumber()+"\n"+ "Marks :"+s.getMarks()  );
	}

}
