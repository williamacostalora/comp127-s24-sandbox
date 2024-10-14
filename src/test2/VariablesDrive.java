package test2;


public class VariablesDrive {
    public static void main(String[] args) {
        Variables v = new Variables(10, 0);
        // Variables.c = 10;
        // v.d = 12;
    }
}


class Variables {
    protected int a;
    final int B;

    private static int c = 0;
    static final int D = 10;


    public Variables(int a, int b) {
        this.a = a;
        this.B = b;

        c++;
    }

    public static int getC() {
        return c;
    }

    public int getB() {
        return B;
    }
}

class ChildVar extends Variables {
    public ChildVar() {
        super(10, 10);
        super.a = 10;
    }
}