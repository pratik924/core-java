package com.rays.basic;

public class Intform {
	public static void main(String[]args) {
		String str = "prati699566262singh";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))){
			count++;	
			}
		}
		System.out.println("no.of int:"+count);
	}

}
