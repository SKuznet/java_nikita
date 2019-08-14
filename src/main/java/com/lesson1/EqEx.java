package com.lesson1;

public class EqEx {
    public static void main(String[] args) {
        int a = 257;
        int b = 257;

        System.out.println(a == b);

        Short aVal = 100;
        Short bVal = 100;

        // byte - cache -128..0..127
        System.out.println(aVal == bVal);

        Short aaVal = 128;
        Short bbVal = 128;
        System.out.println(aaVal == bbVal);

        System.out.println(aaVal.equals(bbVal));

        Cats barsik = Cats.Barsik;
        Cats barsik2 = Cats.Barsik;

        System.out.println(barsik == barsik2);
    }
}
