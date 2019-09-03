package HomeWork.HW9;
//11.19. Определить:
//        а) сумму всех элементов массива;
//        б) произведение всех элементов массива;
//        в) сумму квадратов всех элементов массива;
//        г) сумму шести первых элементов массива;
//        д) сумму элементов массива с k1-го по k2-й (значения k1 и k2 вводятся
//        с клавиатуры; k2 > k1);
//        е) среднее арифметическое всех элементов массива;
//        ж) среднее арифметическое элементов массива с s1-го по s2-й (значения s1
//        и s2 вводятся с клавиатуры; s2 > s1).

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[20];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = arr.length-1; i > 0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum = 0;
        int res = 1;
        int quad = 0;
        int sum6 = 0;
        double sarfm = 1;
        double sarfm12=1;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
            res *= arr[i];
            quad += arr[i]*arr[i];
            sarfm = (double) sum/arr.length;
        }
        for (int i = 0; i <5 ; i++) {
            sum6 += arr[i];
        }
        System.out.println("Summa: " + sum);
        System.out.println("Proizvedenie: " +  res);
        System.out.println("Summa kvadratov: " + quad);
        System.out.println("Summa 0-6: " + sum6);
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite k1");
        int k1 = in.nextInt();
        System.out.println("Vvedite k2");
        int k2 = in.nextInt();
        if (k1 > k2){
            System.out.println("K1 dolzno bit < K2");
        }
        int sum12 = 0;
        for (int i = k1; i < k2 ; i++) {
            sum12 += arr[i];
        }
        System.out.println("Summa K1-K2: " + sum12);
        System.out.println("Srednee arifmeticheskoye: " + sarfm);

        System.out.println("Vvedite s1");
        int s1 = in.nextInt();
        System.out.println("Vvedite s2");
        int s2 = in.nextInt();
        if (s1 > s2){
            System.out.println("S1 dolzno bit < S2");
        }
        int sums1s2 = 0;
        for (int i = s1; i < s2; i++) {
            sums1s2 += arr[i];
            sarfm12 = sums1s2/(s2-s1);
        }
        System.out.println(sums1s2);
        System.out.println("Srednee arfm s2-s1: " + sarfm12);
    }
}
