package practice;

import java.util.Arrays;

public class DSA {
	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,6 };
		System.out.println(Arrays.toString(rightRotaionOne(arr)));

	}

	public static int[] rightRotaionOne(int[] arr) {
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i >= 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0]= temp;
		return arr;
	}

}
