package com.lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("barsik");
        set.add("barsik");
        set.add("barsik");
        set.add("murzik");

        System.out.println(set);
        System.out.println(set.size());

        Set<String> set2 = new HashSet<>();
        set2.add("yuki");
        set2.addAll(set);

        System.out.println(set2);

        System.out.println(set2.containsAll(set));
//        set2.retainAll(set);
        set2.removeAll(set);
        System.out.println(set2);

//        set.clear();
        System.out.println(set);

        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
