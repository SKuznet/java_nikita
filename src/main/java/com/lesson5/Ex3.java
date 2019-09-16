package com.lesson5;

public class Ex3 {
    public static void main(String[] args) {
        Animal animal = new Rabbit();

        Animal animal2 = new Animal() {
            @Override
            public String getS(String val) {
                return "hello " + val;
            }
        };

        // lyambda
        System.out.println(getInfo(S -> S.toUpperCase(), "Murzik"));

        System.out.println(getInfo(animal2, "Barsik"));


    }

    private static String getInfo(Animal animal, String val) {
        return animal.getS(val);
    }
}
