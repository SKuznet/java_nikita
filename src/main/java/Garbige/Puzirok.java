package Garbige;

import java.util.Arrays;
import java.util.Random;

public class Puzirok {
    public static void main(String[] args) {
        int[] arr = new int[]{1,6,7,2,9,5};
        System.out.print(Arrays.toString(arr));
        System.out.println();

        for (int i = 1; i <arr.length; i++) {
            for (int j = arr.length-1; j >= 1; j--) {

                if (arr[j-1] > arr[j]) {
                    int a = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = a;
                }


                System.out.println(Arrays.toString(arr));
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
