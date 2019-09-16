package com.lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Collection
        // Список не уникальных значений
//        List
        // Множество
//        Set
//        Queue
        // size = 10 size * 1.5
        List<String> list = new ArrayList<>();
        list.add("barsik");
        list.add("barsik1");
        list.add("barsik2");
        list.add("barsik3");
        list.add("barsik4");
        list.add("barsik5");
        list.add("barsik6");
        list.add("barsik7");
        list.add("barsik8");
        list.get(2);
        list.add(5, "muzrik");

        List<String> list2 = new LinkedList<>();
        list2.add(5, "barsik");
    }
}
