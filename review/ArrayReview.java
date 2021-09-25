package review;

import java.util.Arrays;

public class ArrayReview {

	public static void main(String[] args) {
		double[] myList = { 1.5, 1.1, 3.5 };

		System.out.println(myList);

		// ?{1.5,1.1,3.5}
		// ? Something else Double@1e2f231

		// Test Cases:
		System.out.println(binarySearch(new int[] {1,2,3,4,5},3)==2);
		System.out.println(binarySearch(new int[] {1,2,3,4,5},2)==1);

		System.out.println(Arrays.toString(selectionSort(new int[] {1,2,3,4,5})));
		System.out.println(Arrays.toString(selectionSort(new int[] {3,2,1,-6,7,2,9,0})));

	}

	// Signaute: binarySearch: int[] int -> int
	// Purpose: Using binary search algorithm to
	// search the key in given sorted array
	// Examples:
	// binarySearch({1,2,3}-->

	public static int binarySearch(int[] arr, int key) {
		// 1.Define low, high and mid index
		int low = 0;
		int high = arr.length - 1;

		int mid = (low + high) / 2;

		//Keep searching until mid>high
		while (mid <= high) {
			// 2.If key < arr[mid] --> search left
			if (key < arr[mid]) {
				high = mid - 1;
				mid = (low + high) / 2;
			}

			// 3.If key > arr[mid] --> search right
			if (key > arr[mid]) {
				low = mid + 1;
				mid = (low + high) / 2;
			}

			// 4.If key == arr[mid] --> found the key in array
			if (key == arr[mid]) {
				return mid;
			}

		}
		
		return -mid-1;

	}

	//Main idea: sort from 1st element till the end,
	//           Find the smallest number from the array put in the 
	///          1st position
	//           Find the 2nd smallest number place in the 2nd position
	//           Find the 3rd smallest number place in the 3rd pos
	//...        Until the (n-1)'s smallest 2nd largest--> we stop
	public static int[] selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length-1;i++) {
			int smallestIndex = i;
			int curSmallestVal = arr[smallestIndex];
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<curSmallestVal) {
					curSmallestVal=arr[j];
					smallestIndex=j;
				}
			}
			
			if(smallestIndex!=i) {
				int temp = arr[i];
				arr[i]=curSmallestVal;
				arr[smallestIndex]=temp;
				
			}
			
		}
		
		
		return arr;
	}
	
}
