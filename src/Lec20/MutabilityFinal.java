package Lec20;

import java.util.ArrayList;
import java.util.List;

public class MutabilityFinal {
    public static void main(String[] args) {
        String name1 = "Hello";
        name1 = "Hi";   // can re-assign
        
        final String name2 = "Hello";
        // name2 = "Hi";    // can't re-assign


        List<Integer> list1 = List.of(1, 2, 3);
        list1.set(0, 10);       // can't change its elements b/c it is immutable
        list1 = List.of(3, 4, 5);    // can re-assign b/c it is not final

        final List<Integer> list2 = List.of(1, 2, 3);
        list2.set(0, 10);       // can't change its elements b/c it is immutable
        // list2 = List.of(3, 4, 5);          // can't re-assign b/c it is final


        final List<Integer> list3 = new ArrayList<>();
        list1.add(10);
        list1.set(0, 10);
        // list3 = new ArrayList<>();
    }
}
