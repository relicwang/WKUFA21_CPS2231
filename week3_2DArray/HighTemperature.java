package week3_2DArray;

//Purpose: Find the highest temperature among given weeks
public class HighTemperature {

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

		// 2. Find the largest temperature
		int largestTemp = temp[0][0];
//		int largestTemp = 0;//Avoid

		for (int rowIndex = 0; rowIndex < temp.length; rowIndex++) {

			for (int colIndex = 0; colIndex < temp[0].length; colIndex++) {
				if (largestTemp < temp[rowIndex][colIndex]) {
					largestTemp = temp[rowIndex][colIndex];
				}
			}
		}
		// --->Already find the lgst temp

		// 3. Show the result
		System.out.println("The largest temperature is " + largestTemp);

		// Purpose: Higest Temp. for each indiviudal week
		// 1. Week 1 --> Higest Temp.
//		int week1HighestTemp = temp[0][0];
//		for(int colIndex=0;colIndex<temp[0].length;colIndex++) {
//			if(week1HighestTemp< temp[0][colIndex]) {
//				week1HighestTemp=temp[0][colIndex];
//			}
//		}
//		
//		System.out.println("Highest Temp in Week 1 is "+week1HighestTemp);
//		
		// 2. Week 2

		// 3. Week 3

		// Better Approach:

		// Save the highest temp. record

		// a. 3 variables ---> w1Temp, w2Temp, e3Temp?
		// b. array
		int[] HighestTemps = new int[temp.length];

		for (int rowIndex = 0; rowIndex < temp.length; rowIndex++) {
			int weeklyHighestTemp = temp[rowIndex][0];

			// a.HighestTemps[rowIndex]=weeklyHighestTemp;
			for (int colIndex = 0; colIndex < temp[0].length; colIndex++) {
				// Compare all temp. in current week,
				// if > weeklyHighestTemp,
				// Updte the weeklyHighestTemp with current temp
				if (weeklyHighestTemp < temp[rowIndex][colIndex]) {
					weeklyHighestTemp = temp[rowIndex][colIndex];
					// b1.HighestTemps[rowIndex]=weeklyHighestTemp;

				}
				// b2.HighestTemps[rowIndex]=weeklyHighestTemp;
			}
			// weeklyHighestTemp--> 1. w1 -->2. w2 --->3. w3
			HighestTemps[rowIndex] = weeklyHighestTemp;

//			System.out.printf("The highest temp. for Week %d is %d \n ", rowIndex+1, weeklyHighestTemp);
		}

		// Print all weekly highest temp.

		int i = 1;
		for (int weelyHiTemp : HighestTemps) {
			System.out.printf("Week %d highest temp. is %d \n", i, weelyHiTemp);
			i++;
		}
		
		
		for (int colIndex = 0; colIndex < temp[0].length; colIndex++) {
			for (int rowIndex = 0; rowIndex < temp.length; rowIndex++) {

				
			}
		}

	}

}
