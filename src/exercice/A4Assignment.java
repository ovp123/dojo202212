package exercice;

import java.util.Arrays;
import java.util.List;

public class A4Assignment {
    public static void main(String[] args) {
        int a, b ,c ,d = (byte)2;
        a = b = c = d;
        System.out.println(a);
//
//        boolean isError = false;
//        if (isError = true){
//            throw new Error();
//        } else System.out.println(isError);

        int   t1 [] = {11, 12, 13};
        int[] t2 = {1, 2, 3};
        System.out.println(t1[(t1=t2)[1]]);  // => t1[t2[1]] == t1[2] == 13
        List<Integer> l1 = Arrays.stream(t1).boxed().toList();
        List<Integer> l2 = Arrays.stream(t2).boxed().toList();
        System.out.println(l1.get((l1=l2).get(1)));  // => t1[t2[1]] == t1[2] == 13

    }
}
