package core.rays.constructor;

public class Circle extends Shape {
	
	private double radius;
	
	
	
	public double getRadius() {
		return radius;
	}

	public Circle(double radius) {
		this.radius = radius;
		
	}


	@Override
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}

}
