package exercice;

import java.util.SortedMap;

public class A8Increment {
    public static void main(String[] args) {
        int i = 10;
//        System.out.println(i++);   // => return i; i = i + 1
//        System.out.println(++i);   // =>  i = i + 1; return i;
//        System.out.println(i++ + i++);  // => (return i; i = i + 1) + (return i; i = i + 1) => 10 + 11 = 21 =>  i = 12
//        System.out.println(i++ + ++i);  // => (return i; i = i + 1) + (i = i + 1; return i) => 10 + 12 = 22 =>  i = 12
//        System.out.println(i);
        int ________ = 2;
        System.out.println(
                ________
                ++ ^ ++
                ________
        );
        System.out.println(i = i++);

        short s;
        s = Short.MAX_VALUE;
        System.out.println((s += 1) / 2);
        s = Short.MAX_VALUE;
        System.out.println((s=(short)(s+1)) / 2);
        s = Short.MAX_VALUE;
        System.out.println(++s / 2);

    }

}
