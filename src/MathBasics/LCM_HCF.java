package MathBasics;

public class LCM_HCF {
    public static void main(String[] args) {
        HCF_LCM(20,30);
        int ans = OPTIMAL_APPROACH(12,14);
        System.out.println(ans);
    }

    public static void HCF_LCM (int A , int B){
        int HCF = 0;
        for(int i = 1 ; i <= Math.min(A,B) ; i ++){
            if(A % i == 0 && B % i == 0){
                HCF = i;
            }
        }
        System.out.println("HCf of A and B is : " + HCF);


    }

    public static int OPTIMAL_APPROACH(int a , int b) {
        while(a > 0 && b > 0){
            if (a > b){
                a = a % b ;
            }
            else{
                b = b% a;
            }
        }
        if(a == 0){
            return b;
        }
        return a;
    }

   public  static Long[] lcmAndGcd(Long A , Long B) {
        Long Hcf = 0L;
        Long Lcm = 0L;

        Long OriginalA = A;
        Long OriginalB = B;
        while (A > 0 && B > 0){
            if(A > B){
                A = A % B;
            }
            else{
                B = B % A;
            }
        }
        if(A == 0){
            Hcf = B;
        }
        else{
            Hcf = A;
        }

        Lcm = OriginalA * OriginalB /Hcf ;

        return new Long[]{ Lcm , Hcf};
    }




}
