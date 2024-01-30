package corejava;

import java.util.function.Function;

public class functionlambda {
    public static void main(String[] args) {
        Function<Integer,Integer>f = n -> n*n;
        System.out.println(f.apply(5));

        Function<String,Integer>fs = i -> i.length();
        System.out.println(fs.apply("helloworld"));
    }
}
