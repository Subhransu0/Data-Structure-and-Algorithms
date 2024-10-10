package practice;

public class FindMinimumInArray {

	public static void main(String[] args) {
     int [] arr = {52,89,41,32,78,31,31,1,1,0,0,-888};
     int min = Minimum(arr);
     System.out.println(min);
	}

	public static int Minimum(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
