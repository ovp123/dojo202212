package operator;

public class Compound {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        i = i + (short)1;
        System.out.println(i);
        int j = Integer.MAX_VALUE;
        j += (short)1;
        System.out.println(j);

        var toto = false;
        if (toto ^= true) System.out.println(toto);

    }
}
