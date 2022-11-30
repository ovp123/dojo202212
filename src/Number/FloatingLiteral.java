package Number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FloatingLiteral {

    public static final float SEUIL = 3;

    public static void main(String[] args) {
        infinity();
        literals();
    }

    private static void literals() {
        float f1 = 1, f2 = 1f, f3 = 1.0f, f4 = 'd', f5 = '\u0001';
        double d1 = 1, d2 = 1f, d3 = 1.0d, d4 = 'd', d5 = 1d, d6 = 1.0, d7 = 1.0d;
        long frenchDebt = 2_901__832_123_945L;
        double frenchDebt2 = 2.901832123945e12;
        double hexFrenchDebt2 = 0x1.51d15623148p41;
    }

    private List error() {
        long[] notes = {12,65,10, 0};
//        try{
            return Arrays.stream(notes)
                    .mapToObj(x -> mapTo(x))
//                    .filter(this::tooSmall)
                    .collect(Collectors.toList());

//                    .forEach(System.out::println);
//        } catch (ArithmeticException e){
//            return 0;
//        }
    }

    private long mapTo(long x) {
        System.out.println(x);
        return 100 / x;
    }


//    private static long getaLong(long x) {
//        return 100 / x;
//    }
    private boolean tooSmall(long l) {
        return 100 / l > SEUIL;
    }

    private static void infinity() {
        System.out.println("(Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY) = " + (Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY));
        System.out.println(Double.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY == Double.POSITIVE_INFINITY);
        System.out.println(Double.NaN == Double.NaN);
        System.out.println(-0.0);
        System.out.println(-0);
        System.out.println(1 / -0.0);
        System.out.println(-0.0 == 0);
        System.out.println(1 / -0.0 == 1 / 0.0);

        System.out.println(Double.toHexString(-Float.MIN_VALUE));
        System.out.println(Double.MAX_VALUE);
        System.out.println(Math.abs(-Double.MAX_VALUE));

    }
}
