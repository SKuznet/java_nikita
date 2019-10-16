package com.lesson8;

public class RunnableEx implements Runnable {
    @Override
    public void run() {
        System.out.println("I am from another thread with interface " + Thread.currentThread().getName());
    }
}
