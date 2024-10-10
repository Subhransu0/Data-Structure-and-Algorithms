package RecursionBasics;

public class PrintName_N_Times {
  static  void printName(int i , int n)
    {
        if(i > n){
            return;
        }
        System.out.println("Subhransu");
        printName(i + 1 , n);
    }

    public static void main(String[] args) {
        printName(1 , 5);
    }
}
