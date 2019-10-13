package com.lesson2;

import java.util.Arrays;

public class StringEx1 {
    public static void main(String[] args) {
        String name = "Barsik";

        System.out.println(name.charAt(1));
        System.out.println(name.length());
        System.out.println(name);

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }

        System.out.println();

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

        System.out.println(name.codePointAt(1));

        char c = 97;
        System.out.println(c);

        char[] dst = new char[name.length()];
        name.getChars(2, 4, dst, 2);
        System.out.println(dst);

        Character[] dst2 = new Character[]{'a', 'b', 'c'};

        for (int i = 0; i < dst2.length; i++) {
            System.out.print(dst2[i]);
        }

//        System.out.println();
//        System.out.println(Arrays.toString(dst2));
//        System.out.println(dst2);
    }
}
