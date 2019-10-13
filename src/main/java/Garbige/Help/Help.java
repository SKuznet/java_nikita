package Garbige.Help;

import java.util.ArrayList;
import java.util.Iterator;

public class Help {
    protected static String first;


    public Help() {
        String e = "i'm from help";
        System.out.println(e);
        int count = 1;
        System.out.println(count);
        count++;
        System.out.println(count);
        System.out.println("--------");
    }


    public static void main(String[] args) {
        Help2 h2 = new Help2();
        h2.hell();
        System.out.println(first);

        ArrayList<Integer> a = new ArrayList<>();
        Iterator<Integer> iterator = a.iterator();
        for (int i = 0; i < 15; i++) {
            a.add(i);
        }
        System.out.println(a);

        while (iterator.hasNext()){
            if (iterator.next() > 10){
                iterator.remove();
            }
            iterator.remove();
        }

    }


}

