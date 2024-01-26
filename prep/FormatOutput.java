package prep;

import java.text.*;

public class FormatOutput {
    public static void main(String[] args) {
        NumberFormat currencyFormater = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormater.format(10.333));

        NumberFormat percentageFormater = NumberFormat.getPercentInstance();
        System.out.println(percentageFormater.format(.12));

        DecimalFormat decimalFormater = new DecimalFormat("00.###");
        System.out.println(decimalFormater.format(3.33443));

        System.out.printf("ICA %3d is %s\n", 3, "fun");
        System.out.printf("ICA %3d is %s\n", 4, "fun");
    }
}
