package com.lesson5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex {
    private final static List<String> list = new ArrayList<>();
    private final static int count = 6;

    public static void main(String[] args) {

//        list = new ArrayList<>();
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Murzik");
        list.add("Murzik");
        list.add("Murzik");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            if(iterator.next().equals("Barsik")) {
                iterator.remove();
            }
        }

        System.out.println(list);

    }
}
