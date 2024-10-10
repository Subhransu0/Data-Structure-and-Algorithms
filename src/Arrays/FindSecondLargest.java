package Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] arr = { 7, 5, 3, 1, 9, 5 };
		System.out.println(secondLargest(arr));

	}

	// optimised solution
	public static int secondLargest(int arr[]) {
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > large) {
				second_large = large;
				large = arr[i];
			} else if (arr[i] > second_large && arr[i] != large) {
				second_large = arr[i];
			}
		}

		return second_large;
	}

	// better solution
	public static int second_largest(int[] arr) {
		int largest = 0;
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[largest] < arr[i]) {
				largest = i;
			}
		}
		int secondLargest = -1;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (secondLargest < arr[i] && arr[i] != arr[largest]) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

}
