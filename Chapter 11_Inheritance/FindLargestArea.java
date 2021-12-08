package Inheritance;

//We have 100 rectangle objects, and 150 triangle objects
//  Find which object has the largest area
public class FindLargestArea {

	public static void main(String[] args) {
		//1. Define 100 objects for holding rectangle objects
		Rectangle rect1 = new Rectangle(1,2);
		Rectangle rect2 = new Rectangle(2,2);
		Rectangle rect3 = new Rectangle(3,21);
		//..
		
		Rectangle rect100 = new Rectangle(1.7,2);

		
		//2. Define 150 objects for holding triangle objects
		Triangle tri1 = new Triangle(1,2,1.5);
		Triangle tri2 = new Triangle(3,4,6);
		//..
		
		Triangle tri150 = new Triangle(5,12,13);

		
		
		
		//3. Find which object have largest area
		GeometricObject maxAreaObject =  rect1;
		
		//Compare maxAreaObject with rest rectangle objects,
		// Anytime we find the area is larger,
		//   update the maxAreaObject
		if(maxAreaObject.getArea()<rect2.getArea()) {
			maxAreaObject=rect2;
		}
		//...
		
		//Compare maxAreaObject with all triangle objects,
		// Anytime we find the area is larger,
		//   update the maxAreaObject
		if(maxAreaObject.getArea()<tri1.getArea()) {
			maxAreaObject=tri1;
		}
		
		
		//Approach 2: using the array 
		GeometricObject [] gos = new GeometricObject[250];
		
		//Save rectangles 
		for(int i=0;i<100;i++) {
			gos[i]=new Rectangle(input.nextDouble(),input.nextDouble());
		}
		
		//Save triangles 
		for(int i=100;i<gos.length;i++) {
			gos[i]=new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
		}
		
		//Find the largest area and the object
		
		double largestArea = gos[0].getArea();
		GeometricObject objectLargestArea = gos[0];

		for(int i=0;i<gos.length;i++) {
			if(gos[i].getArea()>largestArea) {
				largestArea=gos[i].getArea();
			   objectLargestArea=gos[i];
			}
		
		}
		
	}

}
