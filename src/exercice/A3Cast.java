package exercice;

public class A3Cast {
    public static void main(String[] args) {

        int big = 1234567890;
        System.out.println(big - (int) (float) big);   // => -46

        System.out.println("0x" + Long.toHexString(Long.MAX_VALUE));          // => 0x7fffffffffffffff
        System.out.println("0x" + Integer.toHexString((int) Long.MAX_VALUE)); // => 0xffffffff         => -1
        System.out.println((long)Double.MAX_VALUE);      // => 9223372036854775807
        System.out.println((int)Double.MAX_VALUE);       // => 2147483647
        System.out.println((int)(long)Double.MAX_VALUE); // => -1
        System.out.println((short)Double.MAX_VALUE);     // => -1
        System.out.println((short)Double.MIN_VALUE);     // => 0
        System.out.println(Integer.toHexString((int)Long.MAX_VALUE));
        System.out.println(Integer.toHexString((int)Long.MAX_VALUE));
    }
}
