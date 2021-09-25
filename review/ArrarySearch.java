package review;

public class ArrarySearch {

	public static void main(String[] args) {

		//Test Cases
		//1. Find the key in the array
		System.out.println(binarySearch(new int[]{1,2,3,4,5},1)==0);
		System.out.println(binarySearch(new int[]{1,2,3,4,5},5)==4);
		System.out.println(binarySearch(new int[]{1,2,3,4,5},2)==1);
		System.out.println(binarySearch(new int[]{1,2,3,4,5},4)==3);
		System.out.println(binarySearch(new int[]{1,2,3,4,5},3)==2);
		
		System.out.println(binarySearch(new int[]{-90,1,2,3,4,5},2)==2);
		System.out.println(binarySearch(new int[]{-90,1,2,3,4,5},3)==3);

		//2. Key is not in the array
		//a.Key<<Lowest Val
		System.out.println(binarySearch(new int[]{45,78,99,101222},-1)==-1);
		//b.Key>>Largest Val
		System.out.println(binarySearch(new int[]{45,78,99,101222},2222222)==-1);
		//c.Key in the range of <<< and >>> but not in the array
		System.out.println(binarySearch(new int[]{45,78,99,101222},47)==-1);
		System.out.println(binarySearch(new int[]{45,78,99,101222},88)==-1);
		System.out.println(binarySearch(new int[]{45,78,99,101222},100)==-1);
		System.out.println(binarySearch(new int[]{45,99,101222},88)==-1);
		System.out.println(binarySearch(new int[]{},1)==-1);
	}

	//1.Signature: binarySearch: int[] int -> int
	//2.Purpose:   Search the key in given array 
	//              using binary search algorithm
	//3.Examples:
	//            binarySearch({1,2,3,4,5},1) --> 0
	//            binarySearch({-2,7,9,911},1)--> -1
	//            binarySearch({-100,100,200,500},200)--> 2
	//Main goal: Always find the high and low index, and get mid index
	//           compare the mid val. with key.
	//           a. key == arr[mid] ---> return mid
	//           b. key  < arr[mid] --> update the high index --> new mid
	//           c. key  > arr[mid] --> update the low index  --> new mid
	//           ------> Keep going(cut half of the array) until low > high
	public static int binarySearch(int[] arr, int key) {
		
		int low = 0;
		int high = arr.length-1;
		
		//(0+5)/2 -->!2.5 -->2
		int mid =(low+high)/2;

		while (low <= high) {
			// 1.key == arr[mid]
			if (key == arr[mid]) {
				return mid;
			}

			// 2.key < arr[mid]
			if (key < arr[mid]) {
				high = mid - 1;
				mid = (low + high) / 2;
			}
			// 2.key > arr[mid]
			if (key > arr[mid]) {
				low = mid + 1;
				mid = (low + high) / 2;
			}
		}
		return -1;
		
	}

	
	//Signature:
	
	
}
