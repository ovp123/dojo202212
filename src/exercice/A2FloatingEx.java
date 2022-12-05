package exercice;

public class A2FloatingEx {

    public static void main(String[] args) {
//        System.out.println(0.1 + 0.1 + 0.1);
//        System.out.println(0.1 + 0.1 + 0.1 == 0.3);
//        double d = 1;  // 1
//        double d = 1d;  // 1
//        double d = 1D;  // 1  -> surtout pas
//        double d = 01D;  // 1
//        double d = 01.0;  // 1
//        double d = 01.0d;  // 1
//        double d = 01e5;  // 10000
//        double d = 0x1p5;  // 32
//        double d = 0x1e5;  // 485
//        double d = 0x1E3;

        System.out.println(Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY == Double.POSITIVE_INFINITY);
        double negZero = -Double.MIN_VALUE / 2;
        System.out.println(negZero);
        double posZero = Double.MIN_VALUE / 2;
        System.out.println(posZero);
        System.out.println(negZero == posZero);
        System.out.println(posZero == -0);
        System.out.println(negZero == -0);
        System.out.println(1 / posZero);
        System.out.println(1 / negZero);
        System.out.println(1 / posZero == 1 / negZero);
        System.out.println(Double.toHexString(negZero) == Double.toHexString(posZero));

    }
}
