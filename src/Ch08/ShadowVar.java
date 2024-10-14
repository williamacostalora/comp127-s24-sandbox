package Ch08;


class Parent {
    private int x;

    public Parent(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Child extends Parent {
    // x here shadows the x in the parent class.  This is not advaisable
    double x;

    public Child(double x) {
        super((int)(x*2));  // call the parent's class constructor
        this.x = x;
    }

    // override the parent's getX method
    public int getX() {
        return (int) this.x;
    }

    // this is the same as getX method if getX is not overridden
    public int getParentX() {
        return super.getX();
    }

    public double getChildX() {
        return this.getX();
    }
}

public class ShadowVar {
    public static void main(String[] args) {
        Child c = new Child(2);
        System.out.println(c.getX());
        System.out.println(c.getChildX());
        System.out.println(c.getParentX());
    }
}