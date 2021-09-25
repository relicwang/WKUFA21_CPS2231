package week3_2DArray;

//Purpose：Find the largest temp among column 
//           in given temperature 2D array
public class HighTempAmongColumn {

	public static void main(String[] args) {
		// 1. Define weekly temperature
		int[][] temp = new int[3][7];

		// Week 0 Temp.
		temp[0][0] = 8;
		temp[0][1] = 16;
		temp[0][2] = 12;
		temp[0][3] = 10;
		temp[0][4] = 9;
		temp[0][5] = 14;
		temp[0][6] = 7;

		// Week 1 Temp.
		temp[1][0] = 12;
		temp[1][1] = 4;
		temp[1][2] = 19;
		temp[1][3] = 4;
		temp[1][4] = 12;
		temp[1][5] = 3;
		temp[1][6] = 14;

		// Week 2 Temp.
		temp[2][0] = 9;
		temp[2][1] = 27;
		temp[2][2] = 27;
		temp[2][3] = 6;
		temp[2][4] = 3;
		temp[2][5] = 28;
		temp[2][6] = 13;

		// 2. Find the highest temperature among columns

		int[] highestColumnTemp=new int[temp[0].length];
		for (int colIndex = 0; colIndex < temp[0].length; colIndex++) {
			int columnHighest = temp[0][colIndex];
			
			for (int rowIndex = 0; rowIndex < temp.length; rowIndex++) {
				if(columnHighest<temp[rowIndex][colIndex]) {
					columnHighest=temp[rowIndex][colIndex];
				}
				
			}
			highestColumnTemp[colIndex]=columnHighest;
		}

		
		//3. Print the rest
		
		int column =1;
		for(int highColumn: highestColumnTemp) {
			System.out.printf("Highest temp."
					+ "in Column %d is %d \n" , column,highColumn);
			column++;
		}
		
		
		
	}
}
