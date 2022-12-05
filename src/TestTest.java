import java.math.BigDecimal;
import java.time.chrono.ThaiBuddhistChronology;

public class TestTest {

    public static void main(String[] args) {

        System.out.println(Long.toHexString((byte)(Double.MAX_VALUE)));
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(-(Double.POSITIVE_INFINITY));
//        String tttt = "oo".concat('R');
        String ttttt = "oo" + "oo".substring(1);
        double sum = 0;
        long sumLong = 0;
        BigDecimal sumBd = new BigDecimal(0);
        BigDecimal tenCents = new BigDecimal("0.1");
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            sum += 0.1;
//            sumLong += 10;
//            sumBd = sumBd.add(tenCents);
//        }
        System.out.println(sum);
        System.out.println(sumLong);
        System.out.println(sumBd);
        System.out.println(sumLong - sum * 100);
        System.out.println(sumLong - sumBd.multiply(new BigDecimal(100)).longValue());

    }

}
