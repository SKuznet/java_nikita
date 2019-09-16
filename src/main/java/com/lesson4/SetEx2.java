package com.lesson4;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        Cat barsik = new Cat("Barsik");
        Cat murzik = new Cat("murzik");
        System.out.println(murzik.hashCode());

        set.add(barsik);
        set.add(murzik);


        System.out.println(set.contains(murzik));

        murzik.setName("Murzik");
        System.out.println(murzik.hashCode());
        System.out.println(set.contains(murzik));

        System.out.println(set);

        set.add(murzik);
        System.out.println(set);

        Set<Cat> cats = new HashSet<>(set);
//        cats.addAll(set);
        System.out.println(cats);
    }
}
