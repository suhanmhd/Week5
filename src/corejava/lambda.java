package corejava;

import java.util.function.Predicate;

public class lambda {
    public static void main(String[] args) {
        Predicate<Integer> p = i->(i>10);
        System.out.println(p.test(20));

        Predicate<String> str = s->(s.length()>5);
//        System.out.println("string:"+str.test("hellowrold"));

        String names[]={"abcd","xyz","qewssdf","s"};

        for(int j =0;j<names.length;j++){
            if(str.test(names[j])){
                System.out.println(names[j]);
            }
        }
    }
}
