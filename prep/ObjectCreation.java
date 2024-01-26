package prep;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ObjectCreation {
    public static void main(String[] args) {
        String s1 = new String("Hello");

        Scanner scanner = new Scanner(System.in);

        NumberFormat currencyFormater = NumberFormat.getCurrencyInstance();

        DecimalFormat decimalFormater = new DecimalFormat("00.###");
    }
}
