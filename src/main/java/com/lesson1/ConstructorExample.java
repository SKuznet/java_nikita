package com.lesson1;

public class ConstructorExample {

    private String name;

    public ConstructorExample() {
    }

    public ConstructorExample(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorExample constructor = new ConstructorExample();
        System.out.println(constructor.name);
    }
}
