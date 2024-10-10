package MathBasics;

public class Prime {
    public static void main(String[] args) {
        if(PrimeNumber(0)){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime Number");
        }
    }
    public static boolean PrimeNumber(int n){
        int count = 0;
        int sqrt = (int)Math.sqrt(n);
        for(int i = 1 ; i <= sqrt ; i++){
            if(n % i == 0){
                count++;
                if(i != n/i){
                    count ++;
                }

            }
        }

        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
}
