package Garbige.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        Set<Names> set = new HashSet<>();
        Names a = new Names("AAA");
        Names b = new Names("BBB");
        Names c = new Names("CCC");
        String d = "DDd";
        set.add(a);
        set.add(b);
        set.add(c);

        System.out.println(set.size());
        System.out.println(c.hashCode());

        System.out.println(Arrays.toString(new Set[]{set}));

        c.setName("CCc");
        System.out.println(c.hashCode());

        System.out.println(set.size());

        System.out.println(set.contains(c));


    }
}
