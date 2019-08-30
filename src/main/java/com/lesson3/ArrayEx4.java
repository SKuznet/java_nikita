package com.lesson3;

import java.util.Arrays;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[][][] array = new int[4][4][4];
        System.out.println(array.length);
        System.out.println(array[0].length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int k = 0; k < array[0][0].length; k++) {
                    array[i][j][k] = k + 1;
                }
            }
        }

        // O(N2)
        // O(N3) - тяжелая операция

        // Never do the cycle into cycle > 3
        System.out.println(Arrays.deepToString(array));
    }
}
