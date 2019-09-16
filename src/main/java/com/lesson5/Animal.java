package com.lesson5;

@FunctionalInterface
public interface Animal {
    int count = 5;

    static void getStaticInfo() {
        System.out.println("I am static from interface");
    }

    // since java8
    default void getInfo() {
        System.out.println("I am from interface");
    }

    String getS(String val);
}
