package com.rays.exception;

public class TestTryCatch {
	public static void main(String[] args) {
		int a = 0;
		int b = 6;
		
		try {
			int div = b/a;
			System.out.println(div);
		}catch(NullPointerException e) {
			System.out.println("Exception:"+ e.getMessage());
			
		}catch(ArithmeticException e){
			System.out.println("Exception:"+ e.getMessage());
			
		}
		finally {
			System.out.println("always execute");
			
		}
		System.out.println("program is finished");
	}

}
