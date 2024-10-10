package Hashing_Basics;

public class FrequenciesCount {
	public static void main(String[] args) {
		int arr [] = {1,2,1,2,3};
		int n = 5;
	
		countfrequency(arr, n);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void countfrequency(int arr[] , int n) {
		int hash [] = new int[n];
		for(int i = 0; i< n ; i++) {
			if(arr[i] >= 1 && arr[i] <= n) {
				hash[arr[i] - 1] ++;
			}
		}
		
		for(int i = 0 ; i<n ; i++) {
			arr[i] = hash[i];
		}
	}

}
