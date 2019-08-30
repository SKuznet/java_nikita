package com.lesson3;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        String[] array = new String[2];
        System.out.println(Arrays.toString(array));

        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().totalMemory());

        String[] array2 = new String[2];

        System.out.println(array2.length);

        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.println(array2[i]);
        }
    }
}
