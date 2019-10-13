package com.lesson7;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.println(cat.getInfo("barsik"));

        Animal animal = new Animal() {
            @Override
            public String getInfo(String name) {
                return "I am animal with name " + name;
            }
        };

        // since jdk 8
        Animal animal2 = name -> "I am animal with name " + name;

        System.out.println(animal.getInfo("Bags"));
        System.out.println(animal2.getInfo("Rojet"));

        FuncEx1 funcEx1 = new RealFunc();
        funcEx1.getInfo("barsik");

        FuncEx1 funcEx2 = new FuncEx1() {
            @Override
            public void getInfo(String name) {
                System.out.println("Anonymous " + name);
            }
        };
        funcEx2.getInfo("barsik");

        FuncEx1 funcEx3 = name -> {
            name = name.toUpperCase();
            System.out.println("I am lyambda realization " + name);
        };
        funcEx3.getInfo("barsik");
    }
}
