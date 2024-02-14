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
        // foo = 1000;  // I can use this but it would be better to call the more
                        // generic constructor in case that I am doing something
                        // hence, I don't repeat myself
        this(1000);
    }


    // this is another example that show the use of the "this" reference
    // although not neccessory here but makes the code clearer
    public boolean areSame(Boo anotherBoo) {
        return this.foo == anotherBoo.foo;
        // or
        // return foo == anotherBoo.foo;
    }

    // overloaded method, it takes int parameter instead of Boo parameter
    public boolean areSame(int val) {
        return this.foo == val;
    }
}

public class ThisAndOverloading {
    public static void main(String[] args) {
        // Boo object can be instantiated in two different ways
        // because the class has two constructors
        Boo boo1 = new Boo(10);
        Boo boo2 = new Boo();

        System.out.println(boo1.areSame(boo2));
    }
}
