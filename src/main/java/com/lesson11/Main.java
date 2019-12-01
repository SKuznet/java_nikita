package com.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array1 = new int[10000000];
        int[] array2 = new int[10000000];
        Arrays.fill(array1, new Random(1211111).nextInt(1231111));
        Arrays.fill(array2, new Random(1211111).nextInt(1231111));
        array1[999] = 9734;
        array2[999] = 9734;
        array1[1999] = 9734;
        array2[1999] = 9734;
        array1[9299] = 9734;
        array2[9299] = 9734;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Main main = new Main();
        main.findByCriteria(array1, list1);
        main.findByWrongCriteria(array2, list2);

        System.out.println(list1);
        System.out.println(list2);
    }

    private void findByWrongCriteria(int[] array, List<Integer> list) {
        long before = System.currentTimeMillis();
        for (int val : array) {
            String line = String.valueOf(val);
            for (char ch : line.toCharArray()) {
                if (ch == '4') {
                    list.add(val);
                }
            }
        }
        System.out.println("Action with String spent: " + (System.currentTimeMillis() - before));
    }

    private void findByCriteria(int[] array, List<Integer> list) {
        long before = System.currentTimeMillis();
        for (int value : array) {
            int countOfDigit = (int) Math.log10(value);
            int k = value;
            while (countOfDigit >= 0) {
                if (k / ((int) Math.pow(10, countOfDigit)) == 4) {
                    list.add(value);
                }

                k = k % ((int) Math.pow(10, countOfDigit));

                countOfDigit--;
            }
        }
        System.out.println("Action with math logic spent: " + (System.currentTimeMillis() - before));
    }
}
