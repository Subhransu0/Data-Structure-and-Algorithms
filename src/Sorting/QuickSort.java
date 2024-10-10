package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSort {

	public static int partition(List<Integer> arr, int low, int high) {
		int pivot = arr.get(low);
		int i = low;
		int j = high;

		while (i < j) {

			while (arr.get(i) <= pivot && i < high) {
				i++;
			}

			while (arr.get(j) > pivot && j > low) {
				j--;
			}

			if (i < j) {
				int temp = arr.get(i);
				arr.set(i, arr.get(j));
				arr.set(j, temp);
			}

		}
		int temp = arr.get(low);
		arr.set(low, arr.get(j));
		arr.set(j, temp);
		return j;
	}

	public static void qs(List<Integer> arr, int low, int high) {
		if (low < high) {
			int partiIndex = partition(arr, low, high);
			qs(arr, low, partiIndex - 1);
			qs(arr, partiIndex + 1, high);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Length of the Array : ");
		int n = in.nextInt();

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + i + "th index Element : ");
			arr.add(in.nextInt());
		}

		qs(arr, 0, arr.size() - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
