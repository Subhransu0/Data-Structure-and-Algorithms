package RecursionBasics;

public class Print_1_to_N_using_Recursion {

    static void PrintOneToN(int i , int N){
        if(i > N){
            return;
        }
        System.out.println(i);
        PrintOneToN(i + 1 , N);
    }

    public static void main(String[] args) {
        PrintOneToN(1,10);
    }
}
