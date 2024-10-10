package RecursionBasics;

import java.util.ArrayList;

public class Factorial_Of_Number {

    public static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();
        Long factorial = 1L;
        Long i = 1L;
       
        while(factorial <= n){
            list.add(factorial);
            i++;
            factorial = f(i);
            
        }

        return list;
    }

    static Long f(Long n) {
        if (n == 1) {
            return 1L;
        }
        return n * f(n - 1);
    }

    public static void main(String[] args) {
        ArrayList<Long> ans = factorialNumbers(5L);
        for (Long i : ans) {
            System.out.println(i);
        }
    }

}
