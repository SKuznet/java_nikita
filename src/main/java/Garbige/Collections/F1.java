package Garbige.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class F1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Iterator<Integer> iterator =  arr.iterator();


        for (int i = 0; i < 20 ; i++) {
               arr.add(i);
        }

        System.out.println(arr);

        while (iterator.hasNext()){
            if (iterator.next() > 10){
                iterator.remove();
            }
        }
        System.out.println(arr);


    }
}
