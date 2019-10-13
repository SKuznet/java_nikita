package com.lesson6;

public class Ex4 {
    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();
        System.out.println(ex4.getResult());
    }

    // never use exception for return
    // future
    private int getResult() {
        int i = 1;

        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            i = 5;
            return i;
        } finally {
            i = 10;
            System.out.println("I am at finnaly and i = " + i);
            return i;
        }
    }
}
