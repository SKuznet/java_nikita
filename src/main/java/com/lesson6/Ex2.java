package com.lesson6;

public class Ex2 {
    public static void main(String[] args) {
        // try catch finally  throw throws
    }

    private String getResult(String name) {
        if(name.equalsIgnoreCase("Barsik")) {
            return "Welcome home " + name;
        }

        throw new IllegalArgumentException("We expect Barsik, not " + name);
    }
}
