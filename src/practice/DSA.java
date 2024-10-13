package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSA {
	public static void main(String[] args) {
		int arr[] = { 5,4,3,2,1 };
		mergesort(arr, 0, arr.length-1);
		for(int i : arr) {
			System.out.print(i + " ");
		}
		

	}

	public static void mergesort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		mergesort(arr, low, mid);
		mergesort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		List<Integer> temp = new ArrayList<>();
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
		for(int i = low ; i <= high; i++) {
			arr[i] = temp.get(i-low);
		}
	}

}
