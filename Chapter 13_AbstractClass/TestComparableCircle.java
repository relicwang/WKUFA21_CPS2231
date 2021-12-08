package abstractPractice;

import java.util.Arrays;

public class TestComparableCircle {

	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(1);
		
		ComparableCircle c2 = new ComparableCircle(5);
		
		ComparableCircle c3 = new ComparableCircle(3);

//		System.out.println(c1.compareTo(c2));
		
		ComparableCircle[] circles = new ComparableCircle[3];
		
		circles[0]=c1;
		circles[1]=c2;
		circles[2]=c3;

		//Status: c1<c3<c2  (1<3<5)
		//Goal: we want to have our object well sorted in the array
		System.out.println(Arrays.toString(circles));
	
		
		Arrays.sort(circles);// Sort method <-- how to compare between 2 objet
		//   <-- commonly agreed to be defined in the Compraable interface
		
		System.out.println(Arrays.toString(circles));
		
		
		//Sort method, they always rely on a window that can show 
		//   given any two objects , which is larger and which smaller
	
//		int i =1;
//		int j =5;
//		5>1
//		// Trivial
		
//		Object o1 = . 
//	    Object o2;
		/// How to figure out which one is larger/
		// Is very diccult
		
		// To make our life easir
		
		// Introduce the comparable interface
		// Which offer us a common agrrement 
		// can give us guideline about how to compare 2 objects.
 		
		
		
		
		// int: + : c1>c2
						 //      -:  c1<c2
		                 //      0:  c1 ==c2
		
		
	}

}
