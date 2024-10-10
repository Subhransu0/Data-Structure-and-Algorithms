package MathBasics;

public class CountDigits {
    public static int Count(int N){
        int ans = N;
        int count = 0;

        while(N != 0){
            int digits = N % 10;
            if(digits != 0 && ans / digits == 0){
                count++;
            }
            N = N / 10;

        }
        return count;
    }

    public static void main(String[] args) {
       
        int answer = Count(20);
        System.out.println(answer);
    }
}
