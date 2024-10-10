package MathBasics;

public class ArmStrong {
    public static void main(String[] args) {
        if (ArmStrong(154)){
            System.out.println("ArmStrong");
        }
        else{
            System.out.println("Not A ArmStrong");
        }
    }

    public static  boolean ArmStrong(int x){
        int check = x;
        int Arm = 0;
        while(x > 0){
            int rem = x % 10;
            Arm = (rem * rem * rem)+ Arm;
            x = x/ 10;
        }
        if(Arm == check){
            return  true;
        }
        else{
            return false;
        }
    }
}
