package Arrays;

import java.util.Arrays;

public class RotationArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(rightRotaionKtimes(arr, 2)));

	}

	public static int[] leftRotateOne(int[] arr) {

		int temp = arr[0];
		for (int i = 1; i <= arr.length - 1; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		return arr;

	}

	public static int[] RightRotateOne(int[] arr) {
		int temp = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;

		return arr;
	}

	public static int[] leftRotaionKtimes(int[] arr, int k) {
		if (arr.length == 0) {
			return new int[] { -1 };
		}
		k = k % arr.length;

		if (k > arr.length) {
			return new int[] { -1 };
		}

		int temp[] = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}

		for (int i = 0; i < arr.length - k; i++) {
			arr[i] = arr[i + k];
		}
		for (int i = arr.length - k; i < arr.length; i++) {
			arr[i] = temp[i - (arr.length - k)];
		}

		return arr;
	}

	public static int[] rightRotaionKtimes(int[] arr, int k) {

		k = k % arr.length;
		if (arr.length == 0) {
			return new int[] { -1 };
		}
		if(k > arr.length) {
			return new int[] { -1 };
		}
		
		
		int temp [] = new int[k];
		for(int i = 0 ; i < k ;i++) {
			temp[i] = arr[arr.length-k+i];
		}
		
		for(int i = arr.length-1 ; i >= k ; i --) {
			arr[i] = arr[i - k];
		}
		
		for(int i = 0 ; i < k ; i++) {
			arr[i] = temp[i];
		}

		return arr;
	}

}
