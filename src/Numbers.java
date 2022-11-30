import lombok.AllArgsConstructor;
import lombok.Getter;

import java.net.InetAddress;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {
//        ffloat();
//        pieges();
//        representationBase();
//        representationPrimitive();
//        depassemnentInteger();
//        divisionByZero();
        floatingPointValues();
        callZero();
//        double d = Double.MAX_VALUE + 1;
//        System.out.println(d);
//        double add = 10.0;
//        long i = 0;
//        while (d + add == d && i < 1000){
//            add *= 10;
//            i++;
//            System.out.println(add);
//        }
//        System.out.println(d);
//        System.out.println(add);
    }

    static void pieges(){
        System.out.println(10l);   // => 10
        System.out.println(010);   // => 8
        System.out.println(010l);  // => 8
    }
    static void ffloat(){
        System.out.println(0.2f + 0.1 );  // => 0.3000000029802322
    }
    private static void depassemnentInteger() {
        System.out.println((byte)(Byte.MAX_VALUE + 1));       // => -128
        System.out.println((short)(Short.MAX_VALUE + 1));     // => -32_768
        System.out.println((short)(Character.MAX_VALUE + 1)); // => 0
        System.out.println((int)(Integer.MAX_VALUE + 1));     // => -2_147_483_648
        System.out.println((long)(Long.MAX_VALUE + 1));       // => -9__223_372_036__854_775_808
    }
    private static void divisionByZero() {
        System.out.println((byte)1 / 0);
        System.out.println((float)1 / 0);
    }

    private static void floatingPointValues() {
        System.out.println(0.0 / 0);            // => NaN
        System.out.println(-1.0 / 0);           // => -Infinity
        System.out.println(-Double.MIN_VALUE / 2);    // => -0.0
        System.out.println(Double.MIN_VALUE / 2);     // => 0.0
        System.out.println(1.0 / 0);            // => Infinity

        System.out.println(Double.NEGATIVE_INFINITY == Double.NEGATIVE_INFINITY);   // => true
        System.out.println(Double.POSITIVE_INFINITY == Double.NEGATIVE_INFINITY);   // => false
        System.out.println(Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY);   // => true
        double negativeZero = -Double.MIN_VALUE / 2;
        System.out.println(negativeZero == -0);                                     // => true
        System.out.println(negativeZero == 0);                                      // => true
        System.out.println(1.0 / negativeZero == 1.0 / 0);                          // => false
    }

    private static void callZero() {
        var wines = List.of(new Wine(12), new Wine(0));
        var critic = wines.stream()
                .mapToDouble(x-> (1 / x.getCritic()))
                .sum();

    }
}

@Getter
@AllArgsConstructor
class Wine{
    int critic;

//    Wine(int critic){
//        this.critic = critic;
//    }
//
//    public double getCritic() {
//        return critic;
//    }
}
