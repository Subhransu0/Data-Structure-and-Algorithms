package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
	public static void main(String[] args) {
		int[] arr = { 1, 9, 4, 3, 2, 5 };
		System.out.println(Arrays.toString(insertion_sort(arr)));
	}

	public static int[] insertion_sort(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		return arr;
	}

}
