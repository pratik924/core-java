package com.rays.exception;

public class TestException {
	public static void main(String[] args) {
		
		String name = "ram";
		try {
			System.out.println(name.length());
            System.out.println(name.charAt(3));
		}catch(NullPointerException e) {
			System.out.println("Exception:"+e.getMessage());
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Exception1:"+e.getMessage());
			System.out.println("program is finished");
		}
	}

}
