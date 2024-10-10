package practice;

public class MathBasicsPractice {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		ReverseArray(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void ReverseArray(int arr[], int start, int end) {
		if (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			ReverseArray(arr, start + 1, end - 1);
		}

	}

}
