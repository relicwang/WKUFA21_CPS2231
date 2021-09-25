package review;

public class ArraySort {

	public static void main(String[] args) {
		//Test Cases:
		//1. Original Array is empty
		System.out.println(isEqual(
				selectionSort(new int[] {}),new int[] {}));
		//2. Original Array is not empty
		System.out.println(isEqual(
				selectionSort(new int[] {5}),new int[] {5}));
		System.out.println(isEqual(
				selectionSort(new int[] {5,2,3}),new int[] {2,3,5}));
	
		System.out.println(isEqual(
				selectionSort(new int[] {-5,-2,3,8,100,-100}),new int[] {-100,-5,-2,3,8,100}));
	}

	
	//Signature: selectionSort: int[] -> int[]
	//Purpose:   Sort the given array in ascending order
	//            using selection sort algorithm 
	//Examples: selectionSort({1,2,3})--> {1,2,3}
	//			selectionSort({5,-1, 3, 6, -6})
	//           --> {-6,-1, 3, 5, 6}
	
	//Main Idea:
	//         Find the smallest # in the array -> put in the 1st position
	//         Find 2nd smallest #(==find the smallest # except the # in 1st postion)
	//           -> put in the 2nd position
	
	//         Find 3rd smallest #(==find the smallest # except the # in 1st, 2nd postion)
	//           -> put in the 3rd position
	//  ---->  ... ---> Untial the (n-1) smallest
	public static int[] selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int minVal = arr[i];
			int minValIndex = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(minVal>arr[j]) {
					minVal=arr[j];
					minValIndex=j;

				}	
			}
			
			if(minValIndex!=i) {
				int temp = arr[i];
				arr[i]=minVal;
				arr[minValIndex]=temp;
			}
			
		}
		
		return arr;
	}
	
	
	//Signature: isEqual: int[], int[] -> boolean
	//Purpose:   Compare whether 2 arrays are equal
	//             and return the corresponding result
	//Examples: isEqual({},{})->true
	//          isEqaul({1,3},{1,3})->true
	//          isEqaul({1,3,6},{1,6,3})->false
	//          isEqaul({1,6},{1,6,3})->false
	public static boolean isEqual(int[] arr1, int[] arr2) {
		//Two arrays have different length
		if(arr1.length!=arr2.length) {
			return false;
		}
		
		for(int i=0;i<arr1.length;i++) {	
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		
		return true;
		
	} 
}
