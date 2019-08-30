package com.lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[2];
        System.out.println(Arrays.toString(array));
        boolean[] array2 = new boolean[2];
        System.out.println(Arrays.toString(array2));
        double[] array3 = new double[2];

        System.out.println(Arrays.toString(array3));

        // index - 0, 1

        System.out.println(array3[1]);
//        System.out.println(array3[2]);
        int[][] array4 = new int[4][2];
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.deepToString(array4));
    }
}
