package prep;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number and I will to say it in Maori: ");
        int x = scanner.nextInt();

        if(x == 1)
            System.out.println("kotahi");
        else if(x == 2)
            System.out.println("rua");
        else if(x == 3)
            System.out.println("toru");
        else if(x == 4)
            System.out.println("wha");
        else if(x == 5)
            System.out.println("rima");
        else
            System.out.println("I can't count beyond 5");


        // switch (x) {
        //     case 1:
        //         System.out.println("kotahi");
        //         break;
        //     case 2:
        //         System.out.println("rua");
        //         break;
        //     case 3:
        //         System.out.println("toru");
        //         break;
        //     case 4:
        //         System.out.println("wha");
        //         break;
        //     case 5:
        //         System.out.println("rima");
        //         break;
        //     default:
        //         System.out.println("I can't count beyond 5");
        //         break;
        // }
        
        
        scanner.close();
    }
}
