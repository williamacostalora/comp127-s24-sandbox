package Lec12;

public class InhDemoSec1 {
    public static void main(String[] args) {
        // P p = new P();
        // p.prnt();

        P c = new C();
        c.prnt();

        P cc = new CC();
        cc.prnt();

    }}

class P {
    int p;
    void prnt() {System.out.println("P");}
}

class C extends P {
    int c;
    void prnt() {
        super.prnt();
        System.out.println("C");
    }
}

class CC extends C {
    int cc;
    void prnt() {
        super.prnt();
        System.err.println("CC");
    }
}