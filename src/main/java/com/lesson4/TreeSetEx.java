package com.lesson4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(6);
        set.add(8);
        set.add(7);
        int val = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 1000; k++) {
                    val++;
                }
            }
        }

        System.out.println(val);

        // (n*n)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(1);
            }
        }

        // (n)
        for (int i = 0; i < 10; i++) {
            System.out.println(1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(1);
        }
    }
}
