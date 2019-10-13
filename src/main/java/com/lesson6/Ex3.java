package com.lesson6;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Starting...");
        int[] array = new int[2];

        try {
            for (int i = 0; i < 3; i++) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(array));
    }
}
