package Lec22_LambdaExpression;

public class RounderPrinterDriver {
    public static void main(String[] args) {
        float f = 3.335f;
        RounderPrinter.round2Print(f);

        Decorable hd = new HashDecorater();
        RounderPrinter.round2PrintDecorated(f, hd);
        
        Decorable ad = new AngleDecorator();
        RounderPrinter.round2PrintDecorated(f, ad);
    }
}
