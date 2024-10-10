package RecursionBasics;

public class SumOfNnumberRecursion {
    public static void SumOfN_Number(int n , int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        SumOfN_Number(n-1 , sum + n);
    }

    public static void main(String[] args) {
        SumOfN_Number(5 , 0);
    }

}
