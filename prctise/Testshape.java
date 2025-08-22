package com.rays.inheritance.prctise;

public class Testshape {

	public static void main(String[] args) {
		
		Shape s = new Circle();
		Circle c= (Circle)s;
		
		s.setColor("red");
		s.setBorderwidth(10);
        c.setRadius(5);	
        
        System.out.println("color:"+s.getColor()+"\n"+ "borderwidth:"+ s.getBorderwidth() +"\n" +  "area of radius:"+c.area());
	}
}
