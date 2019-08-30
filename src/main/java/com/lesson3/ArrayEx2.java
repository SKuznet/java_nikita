package com.lesson3;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        String[] array = new String[]{"Barsik", "Murzik"};
        // equal
        String[] array2 = new String[2];
        array2[0] = "Barsik";
        array2[1] = "Murzik";

        System.out.println(Arrays.toString(array2));

        for (int i = array2.length -1; i >= 0 ; i--) {
            System.out.println(array2[i]);
        }
    }
}
