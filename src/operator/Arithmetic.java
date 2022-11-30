package operator;


import static utils.WhichPrimitive.whichPrimitive;

public class Arithmetic {
    public static void main(String[] args) {

        promotionRules();

        short s = (short)1;

        int o = 1;
        System.out.println(o
                ++ + ++
                 o + o
                  ++);
        System.out.println(o);

        s = Short.MAX_VALUE;
        System.out.println(s + 1);
        System.out.println(s = (short) (s + 1));
        System.out.println(++s);

    }

    private static void promotionRules() {

        whichPrimitive(1 +1L);               // regle 1 : promotion vers la valeur plus large
        whichPrimitive(1L + 1f);             // regle 2 : si une valeur décimale => valeur décimale
        whichPrimitive((short) 1 + (byte)1); // regle 3 : si byte, char ou short => promotion en int
        whichPrimitive(('a'  + 1.0) / 2);    //regle 4 : après toute les promotions : c'est le résultat le plus large

        short s = 1;
        Long wl = 1L; whichPrimitive((byte) 1 + wl);
        whichPrimitive(Byte.valueOf((byte)s) + Byte.valueOf("1"));


    }


}
