package com.rays.abstration;

public class TestShape {
	public static void main(String[] args) {
		
		Shape s = new Circle();
		
		Circle c = (Circle)s;
		c.setRadius(8);
		
		System.out.println(" area of circle:"+ s.area());
		
		Shape s1 = new Rectangle();
		
		Rectangle r = (Rectangle)s1;
		r.setLength(10);
        r.setWidth(5);
        System.out.println("area of Rectangle:"+ s1.area());
        
        Shape s2 = new Triangle();
        Triangle t = (Triangle)s2 ;
        t.setBase(5);
        t.setHeight(10);
        System.out.println("area of Triangle:"+ s2.area());
	}

}
