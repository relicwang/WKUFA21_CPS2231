package week3_2DArray;

//Purpose: Compute the average of major diagonal
//              in given 2D array
public class AverageMajorDiagonal {

	public static void main(String[] args) {
		//Test Cases:
		//1. Empty 2D array---> 0.0
		System.out.println(equals(
				averageMajorDiagonal(new double[][] {}),
				0.0));
		//2. 2D Array is not empty
		
		//         averageMajorDiagonal({{1,1},
		//                               {1,1}}) -> 1.0
		System.out.println(equals(
				averageMajorDiagonal(new double[][] {{1,1},{1,1}}),
				1.0));
		
		
		//         averageMajorDiagonal({{1,2,3},
		//                               {2,3,4}}) 
		//                               {3,4,5}}) -> 3.0
	
		
		//         averageMajorDiagonal({{-2,6,9},
		//                               {8,-3,9}}) 
		//                               {3,-4,25}}) -> 16.6666...7
	
	
	
	}
	
	
	//Signature: averageMajorDiagonal: double[][] --> double
	//Purpose:   Compute the average value of the major
	//              diagonal in given 2D array and return it.
	//Example:
	//         averageMajorDiagonal({{1,1},
	//                               {1,1}}) -> 1.0
	
	//         averageMajorDiagonal({{1,2,3},
	//                               {2,3,4}}) 
	//                               {3,4,5}}) -> 3.0
	
	public static double averageMajorDiagonal(double[][] m) {
		//1. If array is empty --> return 0
		if(m.length==0) {
			return 0.0;
		}
		
		
		//2. Otherwise, compute the average
		double sum =0;
		
		for(int index =0;index<m.length;index++) {
			sum+=m[index][index];
		}
		
		return sum/m.length;
		
	}
	
	
	//Signature: equals: double double -> boolean
	//Purpose:    Compare whether two given doubles are 
	//              "equal" [diff -a -b ---< 0.0000001]]
	//            and return the result
	//Example: equals(0.50000000000001, 0.5)->ture
	//         equals(0.50000000000001, 0.4)->false
	public static boolean equals(double num1, double num2) {
		return Math.abs(num1-num2)< 0.0000001;
	}
}
