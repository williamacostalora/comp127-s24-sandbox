package Lec22_LambdaExpression;

public class HashDecorater implements Decorable {

    @Override
    public void decorate(String s) {
        System.out.println("### " + s  + " ###");
    }

    @Override
    public void intoduce() {
        System.out.println("Hello from Hash");
    }
}
