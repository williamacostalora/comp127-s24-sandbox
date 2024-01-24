package prep;

/**
 * A practice for && and || logical operators are short-circited in Java
 */
public class ShortCircuite {
    public static void main(String[] args) {
        int x = 0;
        if(0==1 && x++==0)
            System.out.println("Passed the condition");
            
        System.out.println("x = " + x);
        
        int y = 0;
        if(0==0 || y++==0)
            System.out.println("Passed the condition");
            
        System.out.println("x = " + y);
    }
}