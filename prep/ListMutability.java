package prep;

import java.util.List;
import java.util.ArrayList;


public class ListMutability {
    public static void main(String[] args) {
        List<String> list1 = List.of("AA", "BB", "CC");
        // List<String> list1 = new ArrayList<>(List.of("AA", "BB", "CC"));
        System.out.println("init\t" + list1);
        

        // can we add to it?
        list1.add("DD");
        System.out.println("add\t" + list1);


        // can we remove from it?
        list1.remove(0);
        System.out.println("remove\t" + list1);


        // can we modify it?
        list1.set(0, "FF");
        System.out.println("set\t" + list1);
    }
}
