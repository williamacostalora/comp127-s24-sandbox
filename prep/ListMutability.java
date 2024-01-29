package prep;

import java.util.List;
import java.util.ArrayList;


public class ListMutability {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(10, 20, 30);
        // List<Integer> list1 = new ArrayList<>(List.of(10, 20, 30));
       

        System.out.println("Before:\t" + list1);
        System.out.println("Sum = " + sum(list1));
        System.out.println("After:\t" + list1);
        
        System.out.println();
        
        System.out.println("Before:\t" + list1);
        System.out.println("Sum = " + sumM(list1));
        System.out.println("After:\t" + list1);
    }


    // sums the list and did not change its elements
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (Integer item : list) {
            sum += item;
        }

        return sum;
    } 

    
    // sum the list but changes its elements
    public static int sumM(List<Integer> list) {
        int sum = 0;
        for(int i = 0; i<list.size(); i++) {
            sum += list.get(i);
            list.set(i, 0);
        }

        return sum;
    } 
}
