package com.lesson8;

public class Main {
    public static void main(String[] args) {
        System.out.println("I am from: " + Thread.currentThread().getName());

        RunnableEx runnableEx = new RunnableEx();
        Thread thread = new Thread(runnableEx);
        thread.start();

        ThreadEx ex = new ThreadEx();
        ex.start();
    }
}
