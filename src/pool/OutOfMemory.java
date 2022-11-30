package pool;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String toto = "T".repeat(200);
        int i = 0;
        try {
            for (;;i++){
                list.add(Integer.valueOf(200));
                if (i % 100000000 == 0) System.out.println(list.size());
            }
        } catch (Error e){
            System.out.println(i);
        }
    }
}