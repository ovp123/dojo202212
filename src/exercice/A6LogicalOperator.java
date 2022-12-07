package exercice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class A6LogicalOperator {
    public static void main(String[] args) {
        int o_o_o_o = 1;
        int o = 1;
        System.out.println(
         o_o_o_o
         ++ ^ ++
         o_o_o_o
        );
    }

    private static String whatToDoToday(int budget, boolean price, boolean isThereANewStarWars) {
//        if (isGoodWeather & wind < 30 ^ isThereANewStarWars){
//            return "go Paragliding";
//        } else {
//            return "go to cinema";
//        }
//        if (isEnoughMoney() ^ isRaining){
//
//        }
        return "";
    }

    @Test
    void test(){
        Assertions.assertAll(
                () -> Assertions.assertEquals( "go to cinema", whatToDoToday(35, true, true),"1"),
                () -> Assertions.assertEquals("go to cinema", whatToDoToday(0, true, true),"2"),
                () -> Assertions.assertEquals("go to cinema", whatToDoToday(35, false, true),"3"),
                () -> Assertions.assertEquals("go to cinema", whatToDoToday(0, false, true),"4"),
                () -> Assertions.assertEquals("go to cinema", whatToDoToday(35, true, false),"5"),
                () -> Assertions.assertEquals("go Paragliding", whatToDoToday(0, true, false),"6"),
                () -> Assertions.assertEquals("go to cinema", whatToDoToday(35, false, false),"7"),
                () -> Assertions.assertEquals("go to cinema", whatToDoToday(0, false, false),"8")
        );

    }

}
