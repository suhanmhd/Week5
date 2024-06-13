package samples;

import java.util.*;
import java.util.stream.Collectors;

public class MainMethod {
    public static void main(String[] args) {

//        List<String> list = Arrays.asList("suhan","suhail","muhammed");
//        Iterator<String> iterator = list.iterator();
//
////          while (iterator.hasNext()){
////              String ele = iterator.next();
////              System.out.println(ele);
////          }
//
//        ListIterator<String> listIterator = list.listIterator();
//        while (listIterator.hasNext()) {
//            String element = listIterator.next();
//            System.out.println(element);
//            // Process the element
//        }
//        while (listIterator.hasPrevious()) {
//            String element = listIterator.previous();
//            System.out.println(element);
//            // Process the element
//        }
//
//
//        List<Integer> list1 = Arrays.asList(4,6,12,89,45,90,1);
//        list1.stream().sorted().forEach(System.out::println);
//       List<Integer> list2= list1.stream().filter(i -> i >4).sorted().collect(Collectors.toList());
//        System.out.println(list2);
//
//
//
//
//        Car audiCar = new Car() {
//            @Override
//            public void applyBreak() {
//                System.out.println("apply break");
//            }
//        };
//        audiCar.applyBreak();

        Student student = new Student(10,"suhan",10);
        Student student1 = new Student(2,"suhail",9);
        Student student2 = new Student(3,"zakir",1);
        List<Student> list = Arrays.asList(student,student1,student2);
//        Collections.sort(list);
        list.forEach(s ->
            System.out.println(s.getStudentName()+" "+s.getStudentId()+" "+s.getClassName())
        );
    }
}
