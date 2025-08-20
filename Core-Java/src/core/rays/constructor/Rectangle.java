package core.rays.constructor;

public class Rectangle extends Shape {
	private int length;
	private int width;
	public int getLenght() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public Rectangle(int length,int width) {
	this.length = length;
	this.width =  width;
	
	
	
	}
	@Override
	public double area() {
         double area =length*width;
         
		
		return area;
	}

}
