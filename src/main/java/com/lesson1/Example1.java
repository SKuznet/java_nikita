package com.lesson1;

public class Example1 {
    int a = 5;
    static int b = 5;

    // test
    static {
        b = 15;
    }

    {
        a = 10;
    }

    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(new Example1().a);
    }

}
