package Inheritance;

import java.util.Scanner;

//Purose: Test triangle class: user will enter 
//         the values of 3 sides, color and whether
//           is filled
public class TestTriangle {

	public static void main(String[] args) {
		//1. Get 3 sides of triangle from user
		//     then create a triangle
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 sides value:");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		Triangle triangle1 = new Triangle(side1,side2,side3);
		Triangle triangle2 = new Triangle();

		
//		triangle1.equals(triangle2)
		
		//2. Set the color value of the triangle
		System.out.println("Please the color for the triangle:");
		String color = input.next();
		triangle1.setColor(color);
		
		//3. Set whether the triangle is filled
		System.out.println("Please enter a boolean "
				+ "to indicate whether the triangle is filled or not:");
		boolean isFilled = input.nextBoolean();
		triangle1.setFilled(isFilled);
		
		
		//4. Show the created triangle
		System.out.println("Approach 1"+triangle1);

		
		//==
//		System.out.println("Approach 2"+triangle1.toString());

		System.out.println("Area of triangle 1 is "+triangle1.getArea());
		System.out.println("Area of triangle 1 is "+triangle1.getPerimeter());

		
		
//		 java.util.Date dateHired = new  java.util.Date();
//		 System.out.println(dateHired);
		 
		 
	}

}
