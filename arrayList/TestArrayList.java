package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {

	public static void main(String[] args) {
		String[] array = { "red", "green", "blue" };

		System.out.println(java.util.Collections.max(new ArrayList<String>(Arrays.asList(array))));

//		String[] array1 = { "red", "green", "blue" };
		System.out.println(java.util.Collections.min(new ArrayList<String>(Arrays.asList(array))));

		
				
	}
	
//	public static int test1() {
//		throw new ArithmeticException("Test ArithmeticException");
//
//		}
//
//		
//		public static int test2() {
//		throw new IOException("Test IOException");
//		}
//


}
