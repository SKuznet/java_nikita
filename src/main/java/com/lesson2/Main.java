package com.lesson2;

public class Main {
    private static String val;
    char[] val2;

    public static void main(String[] args) {
        Cats c = Cats.Barsik;

        System.out.println(c == Cats.Barsik);

        String name = "barsik";
        name = "Barsik";

        String name2 = "Ba" + "rs" + "ik";
        String name3 = "";
        String name4 = null;
        System.out.println("Hello world");
        System.out.println(val);
    }
}
