package Number;

import javax.imageio.ImageWriteParam;

public class IntegerLiteral {
    public static void main(String[] args) {
        System.out.println(Integer.toHexString(0));                // => 00000000
        System.out.println(Integer.toHexString(Integer.MAX_VALUE));   // => 7fffffff
        System.out.println(Integer.toHexString(Integer.MIN_VALUE));   // => 80000000
        System.out.println(Integer.toHexString(-1));               // => ffffffff
        System.out.println(-Byte.MIN_VALUE == Byte.MIN_VALUE);
        System.out.println(-Integer.MIN_VALUE);                       // => -2147483648
        System.out.println(Integer.MIN_VALUE == -Integer.MIN_VALUE);  // => true
        System.out.println(Math.abs(Integer.MIN_VALUE) >= 0);         // => false
//        System.out.println(Math.absExact(Integer.MIN_VALUE) >= 0);    // => Exception

        baseLiterals();
        representationPrimitive();
        underscore();
        callMethod();
        comportementLimite();
    }

    static void baseLiterals(){
        int binary      = 0b101;        // => 5
        int octal       = 0123;         // => 83
        int decimal     = 123;          // => 123
        int hexadecimal = 0x123;        // => 291
    }

    static void representationPrimitive(){
        byte  b1 = 100, b2 = 'd', b3 = '\u007f'; //  byte  b4 = '\u0080'; => ne compile pas
        short s1 = 100, s2 = 'd', s3 = '\u0080';
        char  c1 = 100, c2 = 'd', c3 = '';
        int   i1 = 100, i2 = 'd';
        long  l1 = 100, l2 = 'd', l3 = 100L;
    }

    static void underscore() {        // JAVA 7
        short endOfLine = 0x0D_0A;
        short endOfLine2 = 0b0000_1101_0000_1010;
        int maxNumberOfRows = 200_000;
        long creditCard = 4974_1234_1234_1234L;
        long frenchDebt = 2_901__832_123_945L;
        Double d = 0x2p-4;
        System.out.println(Double.toHexString(0.1));
        System.out.println(0x1.9999999999999p-4);
        System.out.println(d);
    }

    static void callMethod(){
        methodByte((byte)100);
        methodShort((short)100);
        methodChar('d');
        methodInt(100);
        methodLong(100L);
    }

    static void methodByte(byte b){}
    static void methodShort(short s){}
    static void methodChar(char c){}
    static void methodInt(int i){}
    static void methodLong(long l){}

    static void pieges(){
        System.out.println(10l);   // => 10
        System.out.println(010);   // => 8
        System.out.println(010l);  // => 8
    }

    static void comportementLimite(){
        System.out.println((byte)(Byte.MAX_VALUE + 1));       // +127           => -128
        System.out.println((short)(Short.MAX_VALUE + 1));     // +32_767        => -32_768
        System.out.println((short)(Character.MAX_VALUE + 1)); // +65_565        => 0
        System.out.println((int)(Integer.MAX_VALUE + 1));     // +2_147_483_647 => -2__147_483_648
        System.out.println((long)(Long.MAX_VALUE + 1));       // => -9__223_372_036__854_775_808

        System.out.println(-Byte.MIN_VALUE);
        System.out.println(Math.abs(Byte.MIN_VALUE));
    }

    static void zeroDivide(){
        System.out.println(1 / 0);                // => ArithmeticException
    }
}
