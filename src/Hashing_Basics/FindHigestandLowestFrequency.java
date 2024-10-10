package Hashing_Basics;

import java.util.HashMap;
import java.util.Map;

public class FindHigestandLowestFrequency {
	public static void main(String[] args) {
		
		int arr [] = {15,10,15,10,5 };
		HigestLowestFreq(arr, arr.length);
	}

	public static void HigestLowestFreq(int[] arr, int n) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int maxKey = 0, minKey = 0;
		int maxValue = 0, minValue = n;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();

			if (value > maxValue) {
				maxValue = value;
				maxKey = key;

			}
			if (value < minValue) {
				minValue = value;
				minKey = key;
			}
		}
		
		System.out.println("Maxmium Frequency of the number  is :" + maxKey );
		System.out.println("Minimum Frequency of the number  is :" + minKey );
		
		
		

	}

}
