package com.lesson7;

public class RunnableEx implements Runnable {
    @Override
    public void run() {
        System.out.println("I am from: " + Thread.currentThread().getName());
    }
}
