package samples;

import java.util.ArrayList;

public class Util {
     public static <T> void listIterator(ArrayList<T> list) {
        for(T item : list){
            System.out.println(item);
        }
    }
}
