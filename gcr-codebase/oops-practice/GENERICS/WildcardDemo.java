package GENERICS;

import java.util.Arrays;
import java.util.List;

public class WildcardDemo {

    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pragati", "Rahul", "Aman");

        List<Integer> marks = Arrays.asList(90, 85, 78);

        printList(names);

        System.out.println();

        printList(marks);
    }
}