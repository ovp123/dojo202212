package operator;

public class IncrementOperator {
    public static void main(String[] args) {

        int i;
        i = 1;
        System.out.println(i++ + " " +  i);
        i = 1;
        System.out.println(++i + " " +  i);
        i = 1;
        System.out.println(i++ + i++ + ++i);  // 1 {et i =2} + 2 {et i=3} + (3+1) => 7


        short s = Short.MAX_VALUE;
        int a = (++s / 2 - 1);
        int tt = 1;
        System.out.println((tt)--);

        short s2 = Short.MAX_VALUE;
        int b = ((s2+1) / 2 - 1) ;
        System.out.println(a);
        System.out.println(b);

        i = 1;
        i = i++;  // 1 {et i = 2} puis l'opérateur = affecte 1 => i = 1
    }
}
