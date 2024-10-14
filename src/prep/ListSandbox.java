package prep;

import java.util.List;

public class ListSandbox {
    public static void main(String[] args) {
        List<Object> list1 = List.of("Hello", 127, false, 9.5);
        System.out.println(list1);

        for(Object e : list1) {
            System.out.println(e + "\t" + e.getClass());
        }
    }
}
