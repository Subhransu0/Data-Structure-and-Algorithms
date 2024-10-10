package RecursionBasics;

public class Print_N_to_i {

    public static void PrintNtoI(int N ){
        if(N == 0){
            return;
        }
        System.out.println(N);

        PrintNtoI(N - 1);
    }

    public static void main(String[] args) {
        PrintNtoI(5);
    }
}
