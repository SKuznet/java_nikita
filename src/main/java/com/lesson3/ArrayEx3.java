package com.lesson3;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 15, 1, 4, 22};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = Arrays.copyOf(array, 7);
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[5];
        System.out.println(Arrays.toString(array3));
        Arrays.fill(array3, 2, 4, 2);

        // get element from array - O(1)
        // find element by val - O(n)
        //
        System.out.println(Arrays.toString(array3));
    }
}
