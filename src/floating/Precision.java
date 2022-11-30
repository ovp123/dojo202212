package floating;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class Precision {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.1 + 0.1);
        System.out.println((0.1 + 0.1 + 0.1) == 0.3);

        double price = 0.1;
        long priceInCents = 10;
        BigDecimal bd = BigDecimal.valueOf(1,1);

        System.out.println(DoubleStream.of(price,price,price).average().orElse(0));
        System.out.println(LongStream.of(priceInCents,priceInCents,priceInCents).average().orElse(0));
        System.out.println((bd.add(bd).add(bd).divide(BigDecimal.valueOf(3))));

        Long var = Long.MAX_VALUE- 10000000000L;
        System.out.println(var);
        System.out.println(var + 0.0f);
        System.out.println((long)(var + 0.0f) - var);    // => perte de précision

    }
}
