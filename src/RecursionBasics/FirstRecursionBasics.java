package RecursionBasics;

public class FirstRecursionBasics {
    static int count = 0;
    public static void f(){
        if(count == 4){
            return;
        }
        System.out.println(count);
            count++;
            f();

    }
    public static void main(String[] args) {
        f();
    }
}
