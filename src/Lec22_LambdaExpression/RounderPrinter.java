package Lec22_LambdaExpression;

public class RounderPrinter {
    public static void round2Print(float f) {
        float f_round = round2(f);
        String s = f + " round to " + f_round;
        System.out.println(s);
    }

    public static void round2PrintDecorated(float f, Decorable d) {
        float f_round = round2(f);
        String s = f + " round to " + f_round;
        d.decorate(s);
    }

    private static float round2(float f) {
        return (float) (Math.round(f * 100.0)/100.0);
    }
}
