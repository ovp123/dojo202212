import java.time.LocalDate;

public class ByteCode {
    public static void main(String[] args) {
//        String a = "Hello World";
//        String b = "Hello" + " World";
//        String c = 'H' + "ello World";
//        String d = " Hello World".substring(1);
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a == d);
//        System.out.println(a == new String("Hello World"));
//        System.out.println(a == "Hello World");
        short s = 1;
        int dd = 10102103;
        long dss=3541335413541L;
        float cdss= 1.21304f;
        long tata = (long)s;
        var toto = 36 * s;
        var fre = s++;


        surcharge(toto);
        surcharge(38 * s);
        System.out.println(s++);
        System.out.println(++s);
        System.out.println(s+1);

//        surcharge(s++);
    }

//    static void surcharge(int i){}
//    static void surcharge(long i){}
    static void surcharge(Integer i){}
    static void surcharge(Number i){}
    static void surcharge(Object i){}

    public static native double cos(double a);
}
