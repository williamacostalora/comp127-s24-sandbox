package src;

/**
 * Read values from the use 
 */
public class WhileVsDo {
    public static void main(String[] args) {
        final int SENTINAL = 2;
        int i = 0;

        System.out.println("--- WHILE ---");
        while(i<SENTINAL) {
            i++;
            System.out.println(i);
        }
        

        System.out.println("--- DO ---");
        i = 0;
        do {
            i++;
            System.out.println(i);
        } while(i<SENTINAL);
    }
}
