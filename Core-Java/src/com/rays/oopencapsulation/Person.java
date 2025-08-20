package com.rays.oopencapsulation;

import java.util.Date;

public class Person {
		private String name;
		private String address;
		private Date dob;
		
		public String getname() {
			return name;
		
		}
		
		public void setname(String name) {
			this.name = name;
			
		}
		
		public String getaddress() {
			return address;
			
		}
		public void setAddress(String address) {
			this.address = address;
		
		}
		public  Date getob() {
			return dob ;
		}
		public void setdob( Date dob) {
			this.dob = dob;
			
		}
	}


