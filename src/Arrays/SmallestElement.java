package Arrays;

public class SmallestElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	//	System.out.println(smallest(arr));
	System.out.println(secondsmallest(arr));
	}

	public static int secondsmallest(int[] arr) {
		int small = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int i = 0; i <= arr.length - 1; i++) {
             if(arr[i] < small) {
            	 second = small;
            	 small = arr[i];
             }
             else if(arr[i] < second && arr[i] != small) {
            	 second = arr[i];
             }
		}
		return second;
	}

	public static int smallest(int[] arr) {
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		return small;
	}

}
