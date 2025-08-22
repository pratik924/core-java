package com.rays.polymorphism;

public class ShapebyArray {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0]= new Circle();
		s[1]= new Rectangle();
		s[2]= new Triangle ();
		
		Circle c = (Circle) s[0];
		c.setRadius(2);

		Rectangle r = (Rectangle)s[1];
		r.setLength(10);
		r.setWidth(6);

		Triangle t = (Triangle)s[2];
		t.setBase(8);
		t.setHeight(12);
		for (int i = 0; i < s.length; i++) {
			System.out.println("area:"+s[i].area());
		}
		
	}
}

