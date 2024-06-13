package samples;

public class HashAndEql {
    public int age;
    public String name;

    public static void main(String[] args) {
        HashAndEql obj1 = new HashAndEql();
        obj1.age = 12;
        obj1.name ="suhan";

        HashAndEql obj2 = new HashAndEql();
        obj2.age = 12;
        obj2.name ="suhan";

        System.out.println(obj1.equals(obj2));

    }
}
