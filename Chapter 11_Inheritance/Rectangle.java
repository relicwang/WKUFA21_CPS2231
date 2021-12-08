package Inheritance;

public class Rectangle extends GeometricObject {
	/** Data Fields" width and height **/
	private double width;
	private double height;
	private static int numOfRectangle;// ---> 0 -->#OfNum

	/** No-args Constuctor **/
	// Signatue: Rectangle: ->
//	Rectangle() {
//		//1.
////		this.height=5.0;
////		this.width =1.0;
//		//==
//		//2.
////		Rectangle(5,1);
//		this(5,1);
//		
////		this(5.0, 1.0);
////		  System.out.println("No-arg Constructor");
//		numOfRectangle++;
//	}

	/** Constuctor Takes Height and Width **/
	 // Signature: Rectangle: double double ->
	public Rectangle(double height, double width) {
		this.setWidth(width);
		this.setHeight(height);

//		  System.out.println(" Constructor with args");
		numOfRectangle++;
	}

	// Signature: setWidth: double -> boolean
	// Purpose:
	// Change the value of width if
	// the width >=0 and return true;
	// Otherwise, return false directly.
	// Examples: setWidth(1) ->true (width->1)
	// setWidth(-9) ->false (width will NOT change)
	public boolean setWidth(double width) {
		if (width >= 0) {
			this.width = width;
			return true;
		}

		return false;
	}

	// Signature: setHeight: double -> boolean
	// Purpose:
	// Change the value of height if
	// the width >=0 and return true;
	// Otherwise, return false directly.
	// Examples: setWidth(1) ->true (width->1)
	// setWidth(-9) ->false (width will NOT change)
	public boolean setHeight(double newHeight) {
		if (newHeight >= 0) {
			height = newHeight;
			return true;
		}

		return false;
	}

	// Signature: getWidth: -> double
	// Purpose:
	// Return width
	public double getWidth() {
		return this.width;   //In user test class,
		// /                    can they rect1.width 
	}

	// Signature: getHeight: -> double
	// Purpose:
	// Return height
	public double getHeight() {
		return this.height;
	}

	// Signature: getArea: -> double
	// Purpose: Reuturn the area of our rectangle
	// Example: getArea() --> width*height
	public double getArea() {
		return width * height;
	}

	// Signature: getPerimeter: -> double
	// Purpose: Return the perimeter: of our rectangle
	// Example: getPerimeter() --> 2*(width+height)
	double getPerimeter() {
		return 2 * (width + height);
	}

	//setNumberOfRectCreated():  int -> boolean????
	
	
	
	
//	Signature: getNumberOfRectCreated(): -> int
//    Purpose: Return the number of rectangle has been created
	 
	static int getNumberOfRectCreated() {
		return numOfRectangle;
	}

	/** equals: Object --> boolean
	 * 		 Check the current rectangle with 
	 *         another given object. 
	 *         1. If the another given object is not rectangle, return false
	 *         2. If it is the rectangle, we will check 2 sides if they are 
	 *            are same with current one, return true; otherwise return false
	 *         
	 */
    public boolean equals(Object obj) {
    	//1. Check if obj is triangle,
    	//   if it not, return false.
    	if(obj instanceof Rectangle) {
    		//1. width == width && height == height
    		if(this.width == ((Rectangle)obj).width) {
    			if(this.height == ((Rectangle)obj).height) {
    				return true;
    			}
    			//return false
    		}
    		//return false
    		
    		//2. width == height && height == width
    		if(this.height == ((Rectangle)obj).width) {
    			if(this.width == ((Rectangle)obj).height) {
    				return true;
    			}
    			//return false
    		}
    		
    	}
    	
    
    	return false;
    	
    }

    
    public String toString() {
    	return "Rectangle";
    }
}