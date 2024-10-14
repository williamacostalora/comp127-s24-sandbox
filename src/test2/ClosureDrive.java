package test2;

import java.util.function.BiConsumer;

public class ClosureDrive {
    public static void main(String[] args) {
        Closuer.m1((x, y) -> System.out.println(x * y)
        , 10, 20);

        BCI bci = new BCI();
        Closuer.m1(bci, 10, 20);

        Closuer.m1(ClosureDrive::mm, 10, 20);
    }

    public static void mm(int t, int j) {
        System.err.println(t * j);
    }
}

class BCI implements BiConsumer<Integer, Integer> {
    @Override
    public void accept(Integer t, Integer u) {
        System.out.println(t * u);
    }
}

class Closuer {
    public static void m1(BiConsumer<Integer, Integer> bc, int a, int b) {
        bc.accept(a, b);
    }
}