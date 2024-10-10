package RecursionBasics;

public class Fibonacci {
    public static int f(int n){
        if(n <= 1) return n;

        return f(n-1) + f(n-2);
    }
    public static void main(String[] args) {
        int fibo = f(5);
        System.out.println(fibo);
    }

}
