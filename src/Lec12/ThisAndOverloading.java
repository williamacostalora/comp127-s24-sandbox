package Lec12;

class Boo {
    int foo;

    public Boo(int foo) {
        // the formal parameter foo shadow the instance variable foo
        // because both has the same name.  So, how can we set the
        // instance varialbe in this case?  We use the 'this'
        // reference to refer to the instance variable
        this.foo = foo;
    }

    // this is an overloaded constructor, it has the same name of the 
    // the other constructor but different number of parameter, this one
    // does not take any parameter
    public Boo() {
        this(1000);
    }
}

public class ThisAndOverloading {
    public static void main(String[] args) {
        // Boo object can be instantiated in two different ways
        // because the class has two constructors
        Boo boo1 = new Boo(10);
        Boo boo2 = new Boo();
    }
}
