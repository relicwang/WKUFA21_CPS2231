package Inheritance;

//Purpose: Check whether two triangle are equal
public class TestEqualTriangle {

	public static void main(String[] args) {

		Triangle triangle1 = new Triangle(3,4,5);
		Triangle triangle2 = new Triangle(3,4,5);
		
		System.out.println(triangle1==triangle2);
		System.out.println(triangle1.equals(triangle2));
	}

}
