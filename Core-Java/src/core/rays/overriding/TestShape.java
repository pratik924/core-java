package core.rays.overriding;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Circle();

		// Shape object type cast into child class object here is circle
		Circle c = (Circle) s;

		s.setColor("red");
		s.setBorderwidth(5);
		c.setRadius(10);

		System.out.println("Color:" + s.getColor());
		System.out.println("borderwidth:" + s.getBorderwidth());
		System.out.println("radius" + c.area());
	}

}
