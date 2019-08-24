package com.lesson2;

import java.util.Arrays;

public class StringEx4 {
    public static void main(String[] args) {
        String name = "Barsik";

        System.out.println(name.endsWith("ik"));
        System.out.println(name.startsWith("B"));
        System.out.println(name.startsWith("C"));

        String name2 = " Bars ik  ";
        System.out.println(name2.trim().toLowerCase().replace("a", "A"));
        System.out.println(name2);
        String result = "Abc;DEF;fff";

        String[] array = result.split(";");
        System.out.println(Arrays.toString(array));
    }

    String getResult() {
        int a = 2 + 2;
        return String.valueOf(a);
    }
}
