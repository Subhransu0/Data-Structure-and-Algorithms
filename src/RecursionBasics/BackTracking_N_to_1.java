package RecursionBasics;

public class BackTracking_N_to_1 {
public static void PrintNtoOneBYBackTracking(int i , int N){
    if(i > N){
        return;
    }
    PrintNtoOneBYBackTracking(i+1 , N);
    System.out.println(i);
}

    public static void main(String[] args) {
        PrintNtoOneBYBackTracking(1 , 5);
        
    }
}
