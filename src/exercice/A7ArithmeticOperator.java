package exercice;

import static utils.WhichPrimitive.whichPrimitive;

public class A7ArithmeticOperator {
    public static void main(String[] args) {
        byte b = 1;
        whichPrimitive(1);
        whichPrimitive(1 + 1L);
        whichPrimitive(1 + 1F);
        whichPrimitive(b);
        whichPrimitive(b + 1);
        whichPrimitive(b + b);

    }
}
