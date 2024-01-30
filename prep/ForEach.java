package prep;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list1 = List.of("AA", "BB", "CC");

        for (String item : list1) {
            System.out.println(item);
        }

        for(int i=0; i<list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
