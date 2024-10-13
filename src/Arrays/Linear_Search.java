package Arrays;

import java.util.Arrays;

public class Linear_Search {
	public static void main(String[] args) {
		int arr [] = {58,5,1,9,7,30,0};
		System.out.println(search(arr, 0));
	}

	public static int search(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
           if(arr[i] == target) {
        	   return i;
           }
		}
		return -1;
	}

}
