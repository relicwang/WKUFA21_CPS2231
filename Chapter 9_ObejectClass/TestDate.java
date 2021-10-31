package ObejectClass;

import java.util.Date;
import java.util.Scanner;


public class TestDate {

	public static void main(String[] args) {
		
//		NameOfClass refVarName = new NameOfClass();
//		Scanner input =new Scanner(System.in);
		
		Date newDate = new Date();
		System.out.println(newDate.toString());
		
		newDate.setTime(10000);
		System.out.println(newDate.toString());

		newDate.setTime(1000000);
		System.out.println(newDate.toString());
		
	}

}
