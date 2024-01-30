package prep;

import java.util.List;
import java.util.ArrayList;

public class ListMutability {
    public static void main(String[] args) {
        // List<Integer> accounts = List.of(10, 20, 30);
        List<Integer> accounts = new ArrayList<>(List.of(10, 20, 30));
       
        System.out.println("Before:\t" + accounts);
        System.out.println("Sum = " + sum(accounts));
        System.out.println("After:\t" + accounts);
        
        System.out.println();
        
        System.out.println("Before:\t" + accounts);
        System.out.println("Sum = " + sumM(accounts));
        System.out.println("After:\t" + accounts);
    }


    // sums the list and did not change its elements
    public static int sum(List<Integer> accounts) {
        int sum = 0;
        for (Integer account : accounts) {
            sum += account;
        }

        return sum;
    } 


    // sum the list but changes its elements
    public static int sumM(List<Integer> accounts) {
        int sum = 0;
        for(int i = 0; i<accounts.size(); i++) {
            sum += accounts.get(i);
            accounts.set(i, 0);
        }

        return sum;
    } 
}
