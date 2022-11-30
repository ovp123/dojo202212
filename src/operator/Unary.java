package operator;

public class Unary {
    public static void main(String[] args) {

        short toto = +1;
        short toto2 = 1;
        double a0 = -0.1;
        double a1 = +a0;
        int a = +1;
        short s = 1;
//        Long +S = 1L;
        toto(s);
        toto(+s);
//        toto(+i);

    }
    static void toto(int i){
        System.out.println(i);
    }
    static void toto(Integer i){
        System.out.println(i);
    }
    static void toto(Short i){
        System.out.println(i);
    }
    static void toto(short s){
        System.out.println(s);
    }
    static void toto(long l){
        System.out.println(l);
    }
}
