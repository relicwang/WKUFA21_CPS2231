package exception;

import java.util.Scanner;

//Purpose: Show the corresponding month name and
//           day of months when user gives use
//           the month number.
public class ShowMonthAndDOM {

	public static void main(String[] args) {
		//1. Get the month number from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the month number: ");
		
		int monthNum = input.nextInt();
		
		//2. Print the month name and the day of month
		try {
			System.out.println(monthNameAndDays(monthNum));
		}
		catch(ArrayIndexOutOfBoundsException aibe) {
			System.out.println(aibe.getMessage());
		}
	}
	
	
	//Signature: monthNameAndDays: int -> String 
	//              (might throw the exception: 
	//                  ArrayIndexOutOfBoundsException)
	//Purpose: return the corresponding 
	//           month name and day of month in String
	//
	public static String monthNameAndDays(int monthNum) throws ArrayIndexOutOfBoundsException {
		String[] months = {"January", "February", "March", "April", "May", "June","July", "August",
				"September", "October", "November", "December"};
		int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		
//		if(monthNum<1||monthNum>12) {
//			throw new ArrayIndexOutOfBoundsException("Month number is invalid");
//		}		
		return "Month is "+months[monthNum-1]+" number of days is "+dom[monthNum-1];
	}
	
	

}
