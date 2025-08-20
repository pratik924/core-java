package core.rays.overriding;

public class Testtraingle {
	public static void main(String[]args) {
		Shape s = new Triangle();
		Triangle t = (Triangle)s;
		
		s.setColor("blue");
		t.setBase(20);
		t.setHeight(10);
		System.out.println("color:"+s.getColor());
		System.out.println("area of triangle :"+ t.area());
		
		
	}

}
