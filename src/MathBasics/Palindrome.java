package MathBasics;

public class Palindrome {
    public static boolean palindrome(int x){
        int check = x;
        int sum = 0;
        while(x != 0){
            int rem = x % 10;
            sum = (sum * 10)+ rem;
            x = x/10;
        }
        if(sum < 0){
            return false;
        }
        if(sum == check){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
       boolean ans = palindrome(-252);
        System.out.println(ans);
    }
}
