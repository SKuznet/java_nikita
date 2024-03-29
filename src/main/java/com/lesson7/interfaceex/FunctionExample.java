package com.lesson7.interfaceex;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> function = s -> s.toUpperCase();
        System.out.println(function.apply("Functional interface java 8"));

        Function<String, Integer> function2 = s -> s.length();
        System.out.println(function2.apply("Functional interface java 8"));

        BiFunction<String, String, String> biFunction = new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return s.concat(s2);
            }
        };

        BiFunction<String, String, String> biFunction2 = (s, s2) -> s.concat(s2);

        System.out.println(biFunction2.apply("Functional interface ", "java 8"));
    }
}
