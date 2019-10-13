package HomeWork.HW10;
//11.20
import java.util.Arrays;
import java.util.Random;

public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int sum = 0;
        Random r = new Random();

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i+=2) {
            sum += arr[i-1] - arr[i];

            System.out.println("sum += arr[i-1] - arr[i] = " + sum);
        }

        System.out.println("SUM= " + sum);

    }
}
