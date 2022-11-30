package operator;

import java.util.Arrays;
import java.util.List;

public class Assignment {
    public static void main(String[] args) {
         test();

        int a , b , c ;
        Integer d, e;
        a = e = c = d = c = b= 200;

        System.out.println(e == d);

        System.out.println(a + " " + b);

        int[] a1 = {11, 12, 13, 14};
        int[] b1 = {0,1,2,3};
        System.out.println(a1[(a1=b1)[3]]);


        boolean bool = false;
        if (bool = true)
            throw new RuntimeException();


//        int a, b, c, d, e;
//        a = b = c = d = 1;
//        System.out.println(a + " " + b + " " + c + " " + d );   // 1 1 1 1
//        boolean bool = false;
//        if(bool = true)
//            throw new RuntimeException();   // => exception
    }

    private static void test() {
        int a,b,c;
        a = b = c = 1;
        System.out.println( a + "" + b + "" + c);

        boolean bb = false;
        if (bb) throw new RuntimeException();

        int[] t = {11, 12, 13, 14};
        int u[] = {0, 1, 2, 3};
//        System.out.println(t[(t=u)[2]]);
        System.out.println(t[u[2]]);
        t = u;

        List<Integer> l1 = Arrays.stream(t).boxed().toList();
        List<Integer> l2 = Arrays.stream(u).boxed().toList();

        System.out.println(l1.get((l1=l2).get(2)));
    }
}

