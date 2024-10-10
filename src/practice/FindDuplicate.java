package practice;

import java.util.HashSet;

import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {

		int arr[] = { 5, 6, 6, 7, 8, 9, 1, 4, 5, 1, 11, 11 };

		Set<Integer> dup = duplicate(arr);
		for (int i : dup) {
			System.out.println(i);
		}

	}

	public static Set<Integer> duplicate(int arr[]) {
		Set<Integer> hash = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();

		for (int i = 0; i <= arr.length - 1; i++) {
			if (hash.contains(arr[i])) {
				duplicate.add(arr[i]);
			} else {
				hash.add(arr[i]);
			}
		}

		return duplicate;

	}

}
