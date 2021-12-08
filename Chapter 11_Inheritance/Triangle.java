package Inheritance;

public class Triangle extends GeometricObject{

		/**Side 1, 2, 3**/
		private double side1 =1.0;
		private double side2 =1.0;
		private double side3 =1.0;

		/**no-args Constructor**/
		public Triangle(){
		
		}
		
		
		/**Constructor with side1, side2, side3 pararmeters**/
		public Triangle(double side1,double side2,double side3){
			
			this.side1 = side1;
		
			this.side2 = side2;
			this.side3 = side3;
		
		}
		
		/**Signature: getSide1:  --> double
		 * Purpose:   Return the side1 value
		 */
		public double getSide1() {
			return this.side1;
		}
		
		/**Signature: getSide2:  --> double
		 * Purpose:   Return the side2 value
		 */
		public double getSide2() {
			return this.side2;
		}
		
		/**Signature: getSide3:  --> double
		 * Purpose:   Return the side2 value
		 */
		public double getSide3() {
			return this.side3;
		}
		
		/**Signature: getArea:  --> double
		 * Purpose:   Return area of current triangle
		 */
		public double getArea() {
			double s= (this.side1+this.side2+this.side3)/2;
			double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
			return area;
		}
		
		/**Signature: getPerimeter:  --> double
		 * Purpose:   Return the perimeter of current triangle
		 */
		public double getPerimeter() {
			double perimeter = this.side1+this.side2+this.side3;
			return perimeter;
		}
		
		/**Signature: toString:  --> String
		 * Purpose:   Return the String representation
		 *              of current triangle
		 */
		public String toString() {
			return  super.getDateCreated() +"Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
		}
		
		/** equals: Object --> boolean
		 * 		 Check the current triangle with 
		 *         another given object. 
		 *         1. If the another given object is not triangle, return false
		 *         2. If it is the triangle, we will check 3 sides if they are 
		 *            are same with current one, return true; otherwise return false
		 *         
		 */
	    public boolean equals(Object obj) {
	    	//1. Check if obj is triangle,
	    	//   if it not, return false.
	    	if(obj instanceof Triangle) {
	    		//Test 2 sides are equal
	    		
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }
	
}

