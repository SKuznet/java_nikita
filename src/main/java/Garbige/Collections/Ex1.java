package Garbige.Collections;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите размер ArrayList: ");
        int  k = scaner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < k ; i++) {
            arr.add(r.nextInt(30));
        }
        System.out.println(Arrays.toString(new ArrayList[]{arr}));
        Iterator<Integer> iterator = arr.iterator();

        while (iterator.hasNext()){
            if (iterator.next() > 10){
                iterator.remove();
            }
        }
        System.out.println(arr);
        System.out.println(arr.size());
    }
}
