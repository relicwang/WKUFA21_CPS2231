package week3_2DArray;

//Purpose: Compute the sum of elements in 2D array
public class SumOf2DArray {

	public static void main(String[] args) {
		//Test Case:
		//  --->
		
		double[][] matrix1 = {{1,2,3},
				             {4,3,2}};
		
		System.out.println(sumOfMatrix(matrix1)==15);

	}
	
	
	//Signature:   sumOfMatrix: double[][]  -> double
	//Purpose:      Compute the sum of elements in given 2D array
	//Examples:     sumOfMatrix({{1,2,3},
	//                           {4,3,2}}  -->15
	//               sumOfMatrix({{},
	//                            {}}   ---> 0
	public static double sumOfMatrix(double[][] matrix) {
		//1. Define a variable to sum
		double sum = 0;
		
		//2. Iterate each element and add to sum
		for(int rowIndex=0;rowIndex<matrix.length;rowIndex++) {
			for(int colIndex=0;colIndex<matrix[0].length;colIndex++){
				sum+=matrix[rowIndex][colIndex];
			}
		}
		
		//3. Return sum
		return sum;
	}

}
