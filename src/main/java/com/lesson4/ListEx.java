package com.lesson4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Barsik");
        list.add("Barsik");
        list.add("Murzik");
        list.add("Murzik");

        // NEVER use it!
//        for (String val : list) {
//            if (val.equals("Barsik")) {
//               list.remove("Barsik");
//            }
//        }

        Iterator<String> iterator = list.iterator();

        // before java 8
//        while (iterator.hasNext()) {
//            if(iterator.next().equals("Barsik")) {
//                iterator.remove();
//            }
//        }

        // since java 8
        list.removeIf(O -> O.equals("Barsik"));

        System.out.println(list);
    }
}
