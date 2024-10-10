package RecursionBasics;

public class FactorialOfNFunction {

    //by using only function backtracking
    public static int f(int n){
        if (n == 1) {
            return 1;
        }
        return n * f(n-1);
    }

    //by using parameter recursion
    public static void ff(int n , int mult){
        if (n == 1) {
            System.err.println(mult);
            return ;
        }
        ff(n-1, mult * n);
        
    }

    public static void main(String[] args) {
        int ans = f(4);
        System.out.println(ans);

        ff(4, 1);
    }

}
