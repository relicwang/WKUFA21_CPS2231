package ObejectClass;

import java.util.Scanner;

//Test Rectangles
public class PracticeRectangleObjects {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
		
//		Rectangle rect1 = new Rectangle();
//		System.out.println(rect1.height);
		
		
		Rectangle rect2 = new Rectangle(35.9,3.5);
		System.out.println(rect2.height);
		System.out.println(rect2.width);
		System.out.println(rect2.getArea());
		System.out.println(rect2.getPerimeter());


		Rectangle rect3 = new Rectangle(40,4);
		System.out.println(rect3.height);
		System.out.println(rect3.width);
		System.out.println(rect3.getArea());
		System.out.println(rect3.getPerimeter());
		
		
		int numOfRectangle=Rectangle.getNumberOfRectCreated();
		
		System.out.println("Number of rect. has been created is: "
				+numOfRectangle);
	}

}
