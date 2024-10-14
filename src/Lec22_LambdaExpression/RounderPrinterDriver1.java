package Lec22_LambdaExpression;

public class RounderPrinterDriver1 {
    public static void main(String[] args) {
        float f = 3.335f;
        // RounderPrinter.round2Print(f);

        Decorable hd = new HashDecorater();
        RounderPrinter.round2PrintDecorated(f, hd);
        
        Decorable ad = new AngleDecorator();
        RounderPrinter.round2PrintDecorated(f, ad);
        
        Decorable hd2 = new HashDecorater2();
        RounderPrinter.round2PrintDecorated(f, hd2);
        
        RounderPrinter.round2PrintDecorated(f, new Decorable() {
            public void decorate(String s) {
                System.out.println("!!! " + s + " !!!");
            }
            
        });
        
        RounderPrinter.round2PrintDecorated(f, (String s) -> {
            System.out.println("$$$ " + s + " $$$");
        });

        RounderPrinter.round2PrintDecorated(f, s -> {
            System.out.println("$$$ " + s + " $$$");
        });

        RounderPrinter.round2PrintDecorated(f, s -> System.out.println("$$$ " + s + " $$$"));

        RounderPrinter.round2PrintDecorated(f, System.out::println);

        RounderPrinter.round2PrintDecorated(f, RounderPrinterDriver1::myMethod);
    }

    static void myMethod(String s) {
        System.out.println("%%% " + s + " %%%");
    }
    
    static class HashDecorater2 implements Decorable {
        @Override
        public void decorate(String s) {
            System.out.println("### " + s  + " ###");
        }
    }
}

