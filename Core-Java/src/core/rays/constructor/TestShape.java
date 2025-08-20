package core.rays.constructor;

public class TestShape {
	public static void main(String[] args) {
		
	Shape [] s = new Shape[3];
	 s[0]= new Circle(12);
	 s[1] = new Rectangle(10, 8);
	 s[2] = new Triangle(6, 4);
	 
	 for (int i = 0; i < s.length; i++) {
   System.out.println("area of shape :"+s[i].area());
	 }

	}

}
