package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUnion {
	public static void main(String[] args) {
		int arr1[] = { 1, 1, 2, 3, 4, 5, 5, 6 };
		int arr2[] = { 1, 2, 3, 4, 5, 7, 8 };

		List<Integer> list = findunion(arr1, arr2);
		for(int i : list) {
			System.out.print(i + " ");
		}
	}

	public static ArrayList<Integer> findunion(int arr1[], int arr2[]) {
		ArrayList<Integer> union = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
					union.add(arr1[i]);
				i++;

			} else {
				if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
					union.add(arr2[j]);
				j++;
			}
		}
		while (i < arr1.length) {
			if (union.get(union.size() - 1) != arr1[i])
				union.add(arr1[i]);
			i++;

		}
		while (j < arr2.length) {
			if (union.get(union.size() - 1) != arr2[j])
				union.add(arr2[j]);
			j++;

		}

		return union;
	}

	public static int[] findUnion(int arr1[], int arr2[]) {
		Set<Integer> union = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			union.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			union.add(arr2[i]);
		}
		int size = union.size();
		int newarr[] = new int[size];
		int j = 0;
		for (int i : union) {
			newarr[j++] = i;
		}
		return newarr;
	}

}
