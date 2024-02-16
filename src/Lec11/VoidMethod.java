package Lec11;

public class VoidMethod {
    public static void something(int x) {
        if(x < 0) return;
        if(x > 10) return;

        System.out.println("Hello");
    }
}
