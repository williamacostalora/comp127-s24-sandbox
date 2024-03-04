package Lec21_Defensive_Programming;

public class PassedValue {
    public static int sumArray(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
            array[i] = array[i]*2;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int sum = sumArray(arr);
        System.out.println(sum);

        sum = sumArray(arr);
        System.out.println(sum);
    }
}
