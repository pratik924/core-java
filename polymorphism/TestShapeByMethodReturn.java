package com.rays.polymorphism;

public class TestShapeByMethodReturn {
	public static void main(String[] args) {
		
		Shape[]s = new Shape[3];
		
		s[0]= Shape.getShape(1);
		s[1]= Shape.getShape(2);
		s[2] = Shape.getShape(3);
		
	Circle c = (Circle)s[0];
	c.setRadius(5);
	
	Rectangle r = (Rectangle)s[1];
	r.setLength(10);
	r.setWidth(5);
	
     Triangle t = (Triangle)s[2];
     t.setBase(8);
     t.setHeight(5);
     
     
	  for (int i = 0; i < s.length; i++) {
		  System.out.println("area of circle:"+ Shape.getShape(i));
		
	}	
	  System.out.println("circle:"+ c.area());
	  System.out.println("rectangle:"+ r.area());
	  System.out.println("triangle:"+ t.area());
		
	}

}
