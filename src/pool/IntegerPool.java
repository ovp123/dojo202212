package pool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerPool {

    public static final int OK = 100;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(-128);
        list.add(-128);
        list.add(128);
        list.add(128);
        System.out.println(list.get(0) == list.get(1));     // true  : same objects
        System.out.println(list.get(2) == list.get(3));     // false : different objects
        list.remove(Integer.valueOf(-128));
        list.remove(Integer.valueOf(128));
        list.remove(Integer.valueOf(128));
        list.remove(Integer.valueOf(128));
        System.out.println(list);

        testReturn(100);

        List<Integer> list1 = IntStream.rangeClosed(127,300).boxed().collect(Collectors.toList());
        List<Integer> list2 = IntStream.rangeClosed(127,300).boxed().collect(Collectors.toList());
        Integer index = 128;
        list2.remove(127);

        System.out.println(list2);
    }

    private static void testReturn(int returnCode2) {
        Integer returnCode = 400;
        int ret2 = 400;
        System.out.println(returnCode == 100);
        System.out.println(returnCode == OK);
        System.out.println(returnCode == ret2);
    }

}
