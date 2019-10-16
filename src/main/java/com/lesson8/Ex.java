package com.lesson8;

public class Ex {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 20; j++) {
                    System.out.println(Thread.currentThread().getName() + " " + j);
                    Thread.yield();
                }
            });
            thread.start();
        }
    }
}
