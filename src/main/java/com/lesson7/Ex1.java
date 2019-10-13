package com.lesson7;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("I am from: " + Thread.currentThread().getName());
        ThreadEx threadEx = new ThreadEx();
        threadEx.start();
        RunnableEx runnableEx = new RunnableEx();
        Thread thread = new Thread(runnableEx);
        thread.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am from: " + Thread.currentThread().getName());
            }
        });
        thread2.start();

        Thread thread3 = new Thread(() -> System.out.println("I am from: " + Thread.currentThread().getName()));
        thread3.start();
    }
}
