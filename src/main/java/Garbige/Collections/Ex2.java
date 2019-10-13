package Garbige.Collections;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>() ;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер set: ");
        int z = sc.nextInt();
        System.out.println("Размер: "+z);
        for (int i = 0; i <z ; i++) {
            set.add(r.nextInt(100));
        }
        System.out.println(Arrays.toString(new Set[]{set}));
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            if (iterator.next() > 15){
                iterator.remove();
            }
        }
        System.out.println(Arrays.toString(new Set[]{set}));
        System.out.println("Размер: " + set.size());

        Set<String> setstr = new HashSet<>();
        setstr.add("AAA");
        setstr.add("AAA");
        setstr.add("DDD");
        setstr.add("CCC");
        System.out.println(setstr);
        System.out.println("Размер setstr:" + setstr.size());
    }
}
