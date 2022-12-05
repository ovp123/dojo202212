package exercice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A9StringPool {
    static String START = "start0";
    public static void main(String[] args) {


    }


    boolean isStart(String str){
        return str == START;
    }

    @Test
    void toto(){
        String start = "st" + "ar" + 't' + 0;
        Assertions.assertTrue(isStart(start));
    }
}
