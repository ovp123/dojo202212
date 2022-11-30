import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.numberPromotion();
        m.increment_operator();
        m.compoundOperator();
        m.surcharge();
        m.calcul();
        m.andOr();
        m.shortcircuit();

    }

    private void numberPromotion() {
        System.out.println(1 + 1L);                 // =>  2L
        System.out.println(1L + 1.0f);              // =>  2.0f
        System.out.println((byte)1 * 2);            // =>  2
        System.out.println((byte)1 + 1L + 1.0);     // =>  3.0
        short s = 1;
        System.out.println(s + 1);
        System.out.println(s++);
        int i = 1;
        long l = 1;
        var toto = Long.MAX_VALUE + 1;
        Integer wi = 1;
        s++;
        s+=1;
        s = (short)(s + 1);
        i = i + 1;
        l = l + 1;
        wi = wi + 1;
        System.out.println(toto);
    }

    void IntegerPool(){
        List<Integer> suite = IntStream.range(1, 200).boxed().collect(Collectors.toList());
        suite.remove(Integer.valueOf(130));
        System.out.println(suite.stream().filter(i -> i> 120 && i < 140).toList());
    }

    void increment_operator(){
        int i = 1, j = 1,  k = 1;
        i=i++;
        int res1 = -j++;
        int res2 = -++k;
        System.out.println(i);
        System.out.println(res1);
        System.out.println(res2);
    }

    void arithetic_opertor_with_int(){}

    void surcharge(){
        // règles de promotion
        // - si ça matche un number plus grand
        // - si ça matche un wrapper
        short s = 1;
        Byte wb = 2;
        surcharge(1);
        surcharge(1234567890123456l);
        surcharge(s + s);
        surcharge(wb);
        StringPool();
    }

    private long get(double f) {
        System.out.println(f);
        return (long)f;
    }


    //    private void surcharge(int i){ System.out.println("int"); }
//    private void surcharge(Integer i){ System.out.println("Integer"); }
    private void surcharge(Integer... i){ System.out.println("Integer..."); }

    private void surcharge(Number i){ System.out.println("Number"); }
    private void surcharge(Number... i){ System.out.println("Number..."); }

//    private void surcharge(Short ws){
//        System.out.println("Short");
//    }
//
//
    private void surcharge(double d) {
        System.out.println("double");
    }

    private void surcharge(float f) {
        System.out.println("float");
    }


    void compoundOperator() {
        // 2 différences :
        // fait un cast implicite
        // est évalué 2 fois : si effets de bord sur l'évaluation

//        int i = 1;
//        i = 1 + 2L;  // NE COMPILE PAS : Found long, required int
//        i += 2L;     // => i = 3
        byte z = 127;
        z += z++ ;
        System.out.println("z : " + z);

        int i = 0;
        int[] toto = {1,2,3};
        toto[i++] += 1;                             // => i = 1
        System.out.println(Arrays.toString(toto));  // => [2, 2, 3]

        int i2 = 0;
        int[] toto2 = {1,2,3};
        toto2[i2++] = toto2[i2++] +  1;             // => i2 = 2
        System.out.println(Arrays.toString(toto2)); // => [3, 2, 3]

//        i2 = i2 + l;

    }

    void StringPool(){
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        String toto = sb1.toString();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(toto == s1);
        System.out.println(s3 == s2);
        System.out.println(s1);
    }

    void calcul(){

        // unary operator : pas de promotion en int
        byte b = Byte.MAX_VALUE;
        System.out.println((b + 1) / 2 + 1);  // => (128) / 2 + 1 = 65
        System.out.println(++b / 2 + 1);      // => (-128) / 2 + 1 = -63

        short s = Short.MAX_VALUE;
        System.out.println((s + 1) / 2 + 1); // => 32768 / 2 + 1 =
        System.out.println(++s / 2 + 1);     // = > -32768 / 2 + 1 =

        int i = Integer.MAX_VALUE;
        System.out.println((i + 1) / 2 + 1); // => -1073741823
        System.out.println(++i / 2 + 1);     // => -1073741823

    }

    private void andOr() {
        boolean a= true;
        boolean b= true;
        float f = 12f;

        int i = 0, j = 0;
        System.out.println(i & j);
        System.out.println(true | true & false);  // => (true | (true & false))    => true | false  => true
        System.out.println(true | true && false); // => ((true | true) && false))  => true && false => false
        System.out.println(true || true && false);// => (true || (true && false))  => true || false => true
        System.out.println(true || true ^ false && false);// => (true || ((true ^ false) && false))
                                                    // => (true || (true && false) => true || false => true

//        int n1 = 0b?????????00;
//        int n2 = 0b00000000011;
//        System.out.println(n1 & n2); // => 0b00000000000 => 0
    }



    private void shortcircuit() {
        int i = 0, j = 0 ;  int[] tab = {10, 11};
        boolean b1 = tab[i++] == 10 && tab[i++] == 11; // => true , et i = 2
        boolean b2 = tab[j++] == 9 && tab[j++] == 11; // => false , et i = 1
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(i);
        System.out.println(j);
    }
}