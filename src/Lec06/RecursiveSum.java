package Lec06;

public class RecursiveSum {
    /**
     * Sum the numbers between 0 and i
     */
    public static int sumR(int i) {
        if(i==0)
            return 0;
        else
            return i + sumR(i-1);
    }

    public static void main(String[] args) {
        System.out.println(sumR(4));
    }
}
