package week3_2DArray;


//Purpose: Saving the history temperature
//           into a 2D array.
public class Temperature {

	public static void main(String[] args) {
		int[][] temp = new int[3][7];
		
		//Week 0 Temp.
		temp[0][0]=8;
		temp[0][1]=16;
		temp[0][2]=12;
		temp[0][3]=10;
		temp[0][4]=9;
		temp[0][5]=14;
		temp[0][6]=7;

		//Week 1 Temp.
		temp[1][0]=12;
		temp[1][1]=4;
		temp[1][2]=19;
		temp[1][3]=4;
		temp[1][4]=12;
		temp[1][5]=3;
		temp[1][6]=14;
		
		//Week 2 Temp.
		temp[2][0]=9;
		temp[2][1]=27;
		temp[2][2]=27;
		temp[2][3]=6;
		temp[2][4]=3;
		temp[2][5]=28;
		temp[2][6]=13;
		
		//2.Hard Code Approach
//		int[][] temp2= {
//				{8,16,12,10,7,7},
//				{8,16,12,10,7,7},
//				{8,16,12,10,7,7}
//		};
//		
		//How to generate value : 0, 1, 2
		//Main Goal: Take out each row, and 1D array approach
		//          to print elements
		for(int rowIndex =0;rowIndex<temp.length;rowIndex++ ) {
			for(int colIndex=0;colIndex<temp[0].length;colIndex++) {
				System.out.print(temp[rowIndex][colIndex]+" ");

			}
			System.out.println();/
		}
		
		
		//Using Helper Method
		for(int rowIndex =0;rowIndex<temp.length;rowIndex++ ) {
			print1DArray(temp[rowIndex]);
		}//-->0,1,2
		
		
		
		
//		//Print 1st Row (Week 0) Temp.
//		//temp[0]==myList//1D Array?
//		for(int i=0;i<temp[0].length;i++) {
//			System.out.print(temp[0][i]+" ");
//		}
//		
//		//Print 2nd Row (Week 1) Temp.
//		//temp[0]==myList//1D Array?
//		for(int i=0;i<temp[1].length;i++) {
//			System.out.print(temp[1][i]+" ");
//		}
//		
//		//Print 3rd Row (Week 2) Temp.
//		//temp[0]==myList//1D Array?
//		for(int i=0;i<temp[2].length;i++) {
//			System.out.print(temp[2][i]+" ");
//		}
		
、
		
		
		
	}

	//Signature: print1DArray: int[] ->void
	//Purpose:   Print each element in given 1D array
	//Example:   print1DArray({1,2,3})-->
	//             print "1 2 3"
	public static void print1DArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
