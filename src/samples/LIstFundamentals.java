package samples;

import java.util.ArrayList;

import static samples.Util.listIterator;

public class LIstFundamentals {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add(12);
        list.add(31);
        list.add(1);
        list.add(87);
        list.add(2);

        list2.add("asdf");
        list2.add("Df");
        list2.add("ddxde");

        Util.listIterator(list);
        Util.listIterator(list2);

    }


}
