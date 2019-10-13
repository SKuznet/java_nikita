package com.lesson7;

public class RealFunc implements FuncEx1 {
    @Override
    public void getInfo(String name) {
        name = name.toUpperCase();
        System.out.println("I am real class " + name);
    }
}
