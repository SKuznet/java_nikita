package com.lesson9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // since java 1.5
//        Executor
        System.out.println(Thread.currentThread().getName());

        ExecutorService executor = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 20; i++) {
//            executor.execute(() -> {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    // since java 1.5
//                    Random random = new Random();
//                    int count = random.nextInt(5);
//                    TimeUnit.SECONDS.sleep(count);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }

        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        // authorize request log !main -> thread1
//        for (int i = 0; i < 5; i++) {
//            executor2.execute(() -> {
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName());
//            });
//        }

        ExecutorService executor3 = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executor3.execute(() -> System.out.println("Hello, I am from " + Thread.currentThread().getName()));
        }
        executor3.execute(() -> System.out.println("Hello, I am from " + Thread.currentThread().getName()));
        executor3.execute(() -> System.out.println("Hello, I am from " + Thread.currentThread().getName()));

        executor.shutdown();
        executor2.shutdown();
        executor3.shutdown();
    }

}
