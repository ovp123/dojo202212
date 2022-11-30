package pool;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String2> list = new ArrayList<>();
        for (int i = 1;;i++){
            list.add(new String2());
            if((i & 32767) == 0) System.out.println((double) Runtime.getRuntime().freeMemory() / i );
        }
    }
}
