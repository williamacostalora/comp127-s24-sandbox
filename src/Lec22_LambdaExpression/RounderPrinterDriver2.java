package Lec22_LambdaExpression;

public class RounderPrinterDriver2 {
    public static void main(String[] args) {
        float f = 3.335f;
        RounderPrinter.round2Print(f);

        Decorable hd = new HashDecorater();
        RounderPrinter.round2PrintDecorated(f, hd);
        
        Decorable ad = new AngleDecorator();
        RounderPrinter.round2PrintDecorated(f, ad);
    }
}
