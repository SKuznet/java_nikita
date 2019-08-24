package com.lesson2;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        String name = "Barsik";
        String name2 = "";
        String name3 = null;

        System.out.println(name.isEmpty());
        System.out.println(name2.isEmpty());
//        System.out.println(name3.isEmpty());

        byte[] array = name.getBytes();

        System.out.println(Arrays.toString(array));

        String val1 = "Barsik";
        // not equal
        String val2 = new String("Barsik").intern();

        // never compare objects with ==
        System.out.println(name == val1);
        System.out.println(val1 == val2);

//        System.out.println(val1.equals(val2));
//
//        System.out.println(val1.equalsIgnoreCase("barsik"));
//        System.out.println(val1.compareToIgnoreCase("baRsiR"));
//        System.out.println(val1.compareTo("baRsiR"));
//
//        StringBuilder builder = new StringBuilder();
//        builder.append("Barsik");
//
//        System.out.println(val1.contentEquals(builder));

        // pool literal
    }
}
