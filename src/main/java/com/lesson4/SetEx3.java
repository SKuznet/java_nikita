package com.lesson4;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        Cat bars = new Cat("bars");
        Cat murz = new Cat("murz");
        set.add(bars);
        set.add(murz);

        System.out.println(set);
    }
}
