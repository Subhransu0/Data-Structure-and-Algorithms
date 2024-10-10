package RecursionBasics;

public class Print_1_to_N_BackTracking {
    public static void BackTracking(int i , int N){
        if(i < 1){
            return;
        }
        BackTracking(i-1 , N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        BackTracking(5,5);
    }
}
