package Lec22_LambdaExpression;

public class AngleDecorator implements Decorable {
    @Override
    public void decorate(String s) {
        System.out.println(">>> " + s + " <<<");
    }
}
