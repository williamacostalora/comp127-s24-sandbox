package Lec22_LambdaExpression;

public class RounderPrinterDriver {
    public static void main(String[] args) {
        float f = 3.335f;
        RounderPrinter.round2Print(f);

        Decorable hd = new HashDecorater();
        RounderPrinter.round2PrintDecorated(f, hd);
        
        Decorable ad = new AngleDecorator();
        RounderPrinter.round2PrintDecorated(f, ad);
        
        Decorable sd = new SquareDecorator();
        RounderPrinter.round2PrintDecorated(f, sd);

        RounderPrinter.round2PrintDecorated(f, new Decorable() {
            @Override
            public void decorate(String s) {
                System.out.println("{{{ " + s + "}}}");
            }
        });

        RounderPrinter.round2PrintDecorated(f, (String s) -> {
            System.out.println("::: " + s + ":::");
        });

        
        RounderPrinter.round2PrintDecorated(f, s -> {
            System.out.println("::: " + s + ":::");
        });
        
        RounderPrinter.round2PrintDecorated(f, s -> System.out.println("::: " + s + ":::"));
        
        RounderPrinter.round2PrintDecorated(f, RounderPrinterDriver::printDollar);
    }

    public static void printDollar(String s) {
        System.out.println("$$$ " + s + " $$$");
    }

    static class SquareDecorator implements Decorable {
        @Override
        public void decorate(String s) {
            System.out.println("[[[ " + s + "]]]");
        }
    }
}
