package floating;

import java.math.BigDecimal;

public class ZeroDividing {
    public static void main(String[] args) {

        System.out.println((0.1 + 0.1+ 0.1) / 3);
        System.out.println((0.1 + 0.1+ 0.1) / 3 == 0.1);
        System.out.println(avg(0.1, 0.2, 0));
        System.out.println(avg(0.1, 0.1, 0.1) == 0.1);
        System.out.println(avgExact(0.1, 0.1, 0.1) == 0.1);

    }

    static double avg(double... numbers){
        double sum = 0.0;
        for (double d : numbers) {
            sum += d;
        }
        return sum / numbers.length;
    }

    static double avgExact(double... numbers){
        BigDecimal sum = BigDecimal.valueOf(0);
        for (double d : numbers) {
            sum = sum.add(BigDecimal.valueOf(d));
        }
        return sum.divide(BigDecimal.valueOf(numbers.length)).doubleValue();
    }
}
