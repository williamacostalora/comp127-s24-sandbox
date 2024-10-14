package Lec06;

import java.util.List;
import java.lang.reflect.Array;
import java.util.Iterator;

public class InteratingArrays {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        System.out.println((Object) nums instanceof Iterable);

        /* loop */
        // System.out.println("--- FOR ---");
        // for(int i=0; i<nums.length; i++) {
        //     System.out.println(nums[i]);
        // }

        /* for-each */
        // System.out.println("--- FOR EACH ---");
        // for (Integer num : nums) {
        //     System.out.println(num);
        // }

        /* hasNext/next */
        // System.out.println("--- hasNext/Next ---");
        // Iterator<Integer> itr = nums.iterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }
    }
}
