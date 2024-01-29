package prep;

import java.util.List;


public class ListUsage {
    public static void main(String[] args) {
        List<String> list1 = List.of("AA", "BB", "CC");
        
        // using for
        for(int i=0; i<list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // using for-each
        for (String item : list1) {
            System.out.println(item);
        }
    }
}
