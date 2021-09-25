package review;

public class JavaBasicReview {

	public static void main(String[] args) {

		System.out.println(binarySearch(new int[] { 1, 2, 4, 5 }, 3));

	}

	// Singature: binarySearch: int[], int -> int
	// Purpose: Sea

	public static int binarySearch(int[] srcArr, int key) {
		if (srcArr.length == 0) {
			return -1;
		}

		int low = 0;

		int high = srcArr.length - 1;

		int mid = (low + high) / 2;

		while (low < high) {
			// mid value == key, key is found
			if (srcArr[mid] == key) {
				return mid;
			}
			// mid Value< key --> Search right side
			if (srcArr[mid] < key) {
				low = mid + 1;
			}

			// mid Value > key --> search left side of
			// src array
			else {
				high = mid - 1;
			}

			mid = (high + low) / 2;
		}

		return -mid - 1;
	}

}
