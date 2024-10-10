package Hashing_Basics;

import java.util.HashMap;
import java.util.Scanner;

public class HashingUsingCollection {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give the N value : ");
		int n = in.nextInt();

		// 1,2,3,4,1
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter arr value : ");
			arr[i] = in.nextInt();
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			if (map.containsKey(key)) {
				int freq = map.get(key);
				map.put(key, freq + 1);

			} else {
				map.put(key, 1);
			}
		}

		System.out.println("Enter total length of arr : ");
		int q = in.nextInt();
		while (q-- != 0) {
			
			System.out.println("Enter the number You want to get from hashmap or to find out duplicate number : ");
			int number = in.nextInt();
			if (map.containsKey(number)) {
				System.out.println(map.get(number));
			} else {
				System.out.println("Not found...");
			}

		}
	}

}
