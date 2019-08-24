package com.lesson2;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String name = "Barsik";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        char[] array = name.toCharArray();
        byte[] a = name.getBytes();

        System.out.println(array);
        System.out.println(Arrays.toString(a));

        String val = "AbacAbac";

        System.out.println(val.indexOf('a'));
        System.out.println(val.indexOf('a', 3));
        System.out.println(val.lastIndexOf('a'));

        // recommend
        String res = val.replace("a", "");
        String res2 = val.replaceAll("a", "");
        System.out.println(res);
        System.out.println(res2);

        char[] array2 = val.toCharArray();
        Arrays.sort(array2);

        System.out.println(array2);
    }
}
