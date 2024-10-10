package Arrays;

public class CheckIfArrayisSortedOrNot {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1 , 2 , 3 };
		if (CheckIfSorted(arr)) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is not sorted");
		}
	}

	public static boolean CheckIfSorted(int[] arr) {
		boolean isSorted = false;
		for (int i = 0; i <= arr.length - 2; i++) {
			if (arr[i] <= arr[i + 1]) {
				isSorted = true;
			} else {
				return false;
				
			}
		}

		return isSorted;
	}

}
