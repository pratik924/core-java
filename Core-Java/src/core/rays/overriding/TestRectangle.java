package core.rays.overriding;

public class TestRectangle {
	public static void main(String[]args) {
		
		Shape s = new Rectangle();
		Rectangle r = (Rectangle)s;
		
		s.setColor("red");
		s.setBorderwidth(5);
		r.setLenght(5);
		r.setWidth(10);
		System.out.println("area of rectangle:"+r.area());
	}

}
