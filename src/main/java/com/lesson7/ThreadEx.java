package com.lesson7;

public class ThreadEx extends Thread {
    @Override
    public void run() {
        System.out.println("I am thread from: " + Thread.currentThread().getName());
    }
}
