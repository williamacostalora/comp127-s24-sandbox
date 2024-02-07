package src.prep;

import java.util.List;


public class ListUsage {
    public static void main(String[] args) {
        List<String> list1 = List.of("AA", "BB", "CC");
        
        // using normal for, also know as c-style for
        for(int i=0; i<list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // using for-each, also know as enhanced for
        for (String item : list1) {
            System.out.println(item);
        }
    }
}
