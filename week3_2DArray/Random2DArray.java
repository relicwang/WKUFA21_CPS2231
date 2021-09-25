package week3_2DArray;

import java.util.Arrays;
import java.util.Scanner;

//Purpose:   Create a 2D array where the dimension of it
//               is defined by user, and fill with random
//                value within range [0,49)
//          
public class Random2DArray {
	
	public static void main(String[]args) {
	//1. Get the number of rows and number of columns from user input
	Scanner input = new Scanner(System.in);

	System.out.println("Please enter number of rows and"+
			 " number of columns seperated by a space: ");
	int numOfRow = input.nextInt();
	int numOfColumn = input.nextInt();

	//2. Declare and intialize the array with given dimension.
	double [][] randomMatrix = new double[numOfRow][numOfColumn];

	//3. Fill with random val. in range [0,49)
	for(int rowIndex=0;rowIndex<randomMatrix.length;rowIndex++) {
		for(int colIndex=0;colIndex<randomMatrix[0].length;colIndex++) {
			randomMatrix[rowIndex][colIndex]=Math.random()*49;
		}
	}
	
	//Test
	
	for(int rowIndex=0;rowIndex<randomMatrix.length;rowIndex++) {
		System.out.println(Arrays.toString(randomMatrix[rowIndex]));	
	}
	//{1,2,3}--> myList ---> Arrays.toString(myList)--->" {1,2,3}"
	
	
	
	
	
	
	}
}
