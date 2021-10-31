package ObejectClass;
//Define Rectangle class:
//   1.Property/data field:
//         double width   --> Default: 1.0
//         double height  --> Default: 1.0
//   2.Constructor:
//      non-arg:  Signature: Rectangle:   ->
//      With args：newWidth, new Height:
//                Signature: Rectangle: double double -> 
//   3.Method:
//      getArea():     ->double
//      getPrimeter():  ->double
         
public class Rectangle {
	  /**Data Fields" width and height**/
	  private double width;
	  private double height;
	  static int numOfRectangle;//---> 0 -->#OfNum
	  
	  /**No-args Constuctor**/
	  //Signatue:   Rectangle:  ->
	  Rectangle(){
		  this(5.0,1.0);
//		  System.out.println("No-arg Constructor");
		  numOfRectangle++;
	  }
	  
	  /**Constuctor Takes Height and Width**/
	  //Signatue:   Rectangle:  double double -> 
	  Rectangle(double height, double width){
		  this.setWidth(width);
		  this.setHeight(height);
		  
//		  System.out.println(" Constructor with args");
		  numOfRectangle++;
	  }
	  
	  //Signature: setWidth: double -> boolean
	  //Purpose:
	  //         Change the value of width if
	  //           the width >=0 and return true;
	  //          Otherwise, return false directly.
	  //Examples:  setWidth(1)   ->true (width->1)
	  //             setWidth(-9) ->false (width will NOT change)
	  public boolean setWidth(double newWidth) {
		  if(newWidth>=0) {
			  width= newWidth;
			  return true;
		  }
		  
		  return false;
	  }
	  
	  
	  //Signature: setHeight: double -> boolean
	  //Purpose:
	  //         Change the value of height if
	  //           the width >=0 and return true;
	  //          Otherwise, return false directly.
	  //Examples:  setWidth(1)   ->true (width->1)
	  //             setWidth(-9) ->false (width will NOT change)
	  public boolean setHeight(double newHeight) {
		  if(newHeight>=0) {
			  height= newHeight;
			  return true;
		  }
		  
		  return false;
	  }
	  
	  
      //Signature: getWidth:   -> double
	  //Purpose:
	  //   Return width
	  public double getWidth() {
			return this.width;
	  }
	  
	  
	  //Signature: getHeight:   -> double
	  //Purpose:
	  //   Return height
	  public double getHeight() {
			return this.height;
	  }
	  
	  //Signature: getArea: -> double
	  //Purpose: Reuturn the area of our rectangle
	  //Example: getArea() --> width*height
	  double getArea() {
		  return width*height;
	  }
	  
	  
	  //Signature: getPerimeter: -> double
	  //Purpose: Reuturn the perimeter: of our rectangle
	  //Example: getPerimeter() --> 2*(width+height)
	  double getPerimeter() {
		  return  2*(width+height);
	  }
	  
	  
	  //Signature: getNumberOfRectCreated():  -> int
	  //Purpose:   Return the number of rectangle has been created
	  static int getNumberOfRectCreated() {
		  return numOfRectangle;
	  }

	  
}
