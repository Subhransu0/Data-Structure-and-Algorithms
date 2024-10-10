package RecursionBasics;

public class SumOfNByUsingFunctionOnlyNoParameter {

    public static int f(int n){
        if(n == 0){ 
            return 0;
        }
        return n + f(n-1);
        
    }
    public static void main(String[] args) {
        int ans = f(5);
        System.out.println(ans);
    }

}
