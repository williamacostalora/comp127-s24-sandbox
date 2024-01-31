package Lec06;

import java.util.Iterator;
import java.util.List;

public class IteratingCollections {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 20, 30);
        // System.out.println(nums instanceof Iterable);

        /* loop */
        // for(int i=0; i<nums.size(); i++) {
        //     System.out.println(nums.get(i));
        // }

        /* for-each */
        // for (Integer num : nums) {
        //     System.out.println(num);
        // }

        /* hasNext/next */
        // Iterator<Integer> itr = nums.iterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }
    }
}
