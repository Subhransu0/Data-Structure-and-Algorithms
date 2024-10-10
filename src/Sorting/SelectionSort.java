package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the arrays : ");
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Array Element : ");
			arr[i] = in.nextInt();
		}

		System.out.println("Sorted Array is :" + Arrays.toString(selection_sort(arr)));
	}

	public static int[] selection_sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}

		return arr;
	}

}
