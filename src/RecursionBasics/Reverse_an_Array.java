package RecursionBasics;

public class Reverse_an_Array {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5 , 6};

        // ReverseArray(arr);
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }

        // f(0, arr.length-1, arr);
        // for (int i : arr) {
        //         System.out.print(i + " ");
        //     }

        f1(0, arr.length, arr);
        for(int i :  arr){
            System.out.print(i+ " ");
        }

    }

    // Recursion by two pointer
    public static void f(int start , int end , int [] arr){
        if(start >= end){
            return;
        }
        swap(arr, start, end);
        f(start + 1, end-1,arr);
    }

    public static void f1(int start , int n , int [] arr){
        if(start >= n/2) return;
        swap(arr, start, n-start-1);
        f1( start + 1, n, arr);
    }


    //Normal Method
    public static void ReverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    //Swap Method
    public static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
