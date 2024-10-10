package practice;

import java.util.ArrayList;

public class Merge_sort {
	public static void main(String[] args) {
		int arr[] = { 1, 9, 7, 6, 3, 4, 2, 0, 45 };
		merge_sort(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void merge_sort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		merge_sort(arr, low, mid);
		merge_sort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	public static void merge(int[] arr, int low, int mid, int high) {
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
}
