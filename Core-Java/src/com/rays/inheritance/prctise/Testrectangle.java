package com.rays.inheritance.prctise;

public class Testrectangle {
	public static void main(String[] args) {
		Shape s = new Rectangle();
		Rectangle r = (Rectangle)s;
		
		s.setColor("blue");
		r.setLength(12);
		r.setWidth(5);
		
		System.out.println("color :"+s.getColor()+"\n"+"area of rectangle:"+ r.area());
		
		
	}

}
