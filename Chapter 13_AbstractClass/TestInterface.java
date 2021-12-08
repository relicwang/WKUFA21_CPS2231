package abstractPractice;

import java.util.Arrays;

public class TestInterface {
	// Main method
	  public static void main(String[] args) {
	    // Create two comarable rectangles
	    ComparableCircle circle1 = new ComparableCircle(5);
	    ComparableCircle circle2 = new ComparableCircle(15);

	    // Display the max rect
	    ComparableCircle circle3 = (ComparableCircle)Max.max(circle1, circle2);
	    System.out.println("The max circle's radius is " + circle3.getRadius());
	    System.out.println(circle3);
	    
	    ComparableCircle[] circles = new ComparableCircle[2];
	    circles[0]=circle1;
	    circles[1]=circle2;

	    Arrays.sort(circles);
	  }
	}

	class ComparableCircle1 extends Circle  {
	  /** Construct a ComparableRectangle with specified properties */
	  public ComparableCircle(double radius) {
	    super(radius);
	  }

	
	  public int compareTo(ComparableCircle o) {
	    if (getRadius() > o.getRadius())
	      return 1;
	    else if (getRadius() < o.getRadius())
	      return -1;
	    else
	      return 0;
	  }
	}

	//Max.java: Find a maximum object
	class Max {
	  /** Return the maximum of two objects */
	  public static ComparableCircle max
	      (ComparableCircle o1, ComparableCircle o2) {
	    if (o1.compareTo(o2) > 0)
	      return o1;
	    else
	      return o2;
	  }
	}
