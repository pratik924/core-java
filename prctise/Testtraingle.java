package com.rays.inheritance.prctise;

public class Testtraingle {
	public static void main(String[] args) {
		Shape s = new Triangle();
		Triangle t = (Triangle)s;
		
		s.setColor("black");
		t.setBase(10);
		t.setHeight(6);
		System.out.println("--------- ");
		System.out.println("triangle");
		System.out.println("color:"+ s.getColor()+ "\n"+ "area of tiangle: "+ t.area());
		
		
	}

}
