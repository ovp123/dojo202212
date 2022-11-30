package floating;

import java.awt.image.DataBufferDouble;

public class Infinity {
    public static void main(String[] args) {
        System.out.println("(Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY) = " + (Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY));
        System.out.println("(Double.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY) = " + (Double.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY));
        System.out.println("(Double.POSITIVE_INFINITY == Double.NEGATIVE_INFINITY) = " + (Double.POSITIVE_INFINITY == Double.NEGATIVE_INFINITY));
        System.out.println("(Double.NaN == Double.NaN) = " + (Double.NaN == Double.NaN));
        double negativeZero = -Double.MIN_VALUE / 2;
        System.out.println("negativeZero = " + negativeZero);
        System.out.println("(negativeZero == 0) = " + (negativeZero == 0));
        System.out.println("(1 / negativeZero) = " + (1 / negativeZero));
        System.out.println("(1 / 0) = " + (1 / 0.0));
        System.out.println("(1 / negativeZero == 1 / 0.0) = " + (1 / negativeZero == 1 / 0.0));
        double negZero = -0;
        System.out.println("(1 / negZero == 1 / 0) = " + (1 / negZero == 1 / 0.0));
    }
}
