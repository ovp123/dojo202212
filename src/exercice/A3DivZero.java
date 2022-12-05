package exercice;

import java.util.Arrays;

public class A3DivZero {

    public static void main(String[] args) {
        try {
            if(avg() >= 10){
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
        } catch (ArithmeticException e) {
            System.out.println("no note yet");
        }
    }

    static int avg(int... i){
        return Arrays.stream(i)
                .sum() / i.length;
    }
//    static double avg(int... i){
//        return (double)Arrays.stream(i)
//                .sum() / i.length;
//    }

}
