package src.prep;


public class CompareFloats {
    public static void main(String[] args) {
        double x = 1f/3f + 2f/3f;
        double y = 1f/3f;
        y += 2f/3f;
        
        System.out.println(x == y);
    }
}
