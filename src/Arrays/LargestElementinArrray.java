package Arrays;

import java.util.ArrayList;

public class LargestElementinArrray {
	public static void main(String[] args) {
		int arr[] = {9,1,5};
		mergesort(arr, 0, arr.length - 1);
		
		
		System.out.println(arr[arr.length-1]);
	}

	public static void mergesort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		mergesort(arr, low, mid);
		mergesort(arr, mid + 1, high);
		Merge(arr, low, mid, high);
	}

	public static void Merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;

			}
		}
		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}

	}

	public static int largest(int[] arr) {

		int large = 0;
		for (int i = 1; i <= arr.length - 1; i++) {
			if (arr[large] < arr[i]) {
				large = i;
			}
		}

		return arr[large];
	}

}
