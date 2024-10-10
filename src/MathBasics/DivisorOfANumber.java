package MathBasics;

import java.util.ArrayList;
import java.util.List;

public class DivisorOfANumber {
    public static void main(String[] args) {
        List<Integer> list = divisorOfAnUmber(12);
        System.out.println(list);
    }
    public static List<Integer> divisorOfAnUmber(int n){
        List<Integer> list = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);
        for(int i = 1 ; i <= sqrt ; i ++){
            if(n % i == 0){
                list.add(i);
                if(i != n/i){
                    list.add(n/i);
                }
            }
        }

        return list;
    }
}