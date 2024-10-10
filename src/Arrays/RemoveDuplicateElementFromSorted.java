package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElementFromSorted {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 2, 3, 3, 3, 4, 4 };
//		HashSet<Integer> ans = duplicate(arr);
//		for (int i : ans) {
//			System.out.print(i + " " + "BRUTE");
//		}

		int ans = removeduplicate(arr);
		for (int i = 0; i < ans; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	// brute solution
	public static HashSet<Integer> duplicate(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i <= arr.length - 1; i++) {
			set.add(arr[i]);
		}

		return set;
	}

	// optimised
	public static int removeduplicate(int[] arr) {
		int i = 0;
		for (int j = 1; j <= arr.length - 1; j++) {
			if (arr[i] != arr[j]) {
				arr[i + 1] = arr[j];
				i++;
			}
		}

		return i + 1;
	}

}
