package prep;

import java.util.*;

public class MutabilityE {
    public static void main(String[] args) {
        List<Integer> accounts = List.of(100, 200, 300);
        // List<Integer> accounts = new ArrayList<>(List.of(100, 200, 300));

        System.out.println("Before:\t" + accounts);
        System.out.println("Sum = " + sum(accounts));
        System.out.println("After:\t" + accounts);
    }

    public static int sum(List<Integer> nums) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++) {
            sum += nums.get(i);

            nums.set(i, 0);
        }

        return sum;
    }
}
