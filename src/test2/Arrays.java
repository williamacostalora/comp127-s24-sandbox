package test2;

public class Arrays {
    public static void main(String[] args) {
        // int[] a = new int[10];

        // for(int i : a) {
        //     System.out.println(i);
        // }

        acc("1", "2", "3", "4", "5");
    }

    static void acc(String ... arr) {
        for(String s : arr) {
            System.out.println(s);
        }
    }
}
