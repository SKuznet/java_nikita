package com.lesson10;

import java.util.concurrent.TimeUnit;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.err.println("Entry " + Thread.currentThread().isInterrupted());

            for (int i = 0; i < 100000000; i++) {
                System.err.println(i);

                try {
                    System.err.println("Try " + Thread.currentThread().isInterrupted());
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    System.err.println("Catch " + Thread.currentThread().isInterrupted());
                }

                if(Thread.currentThread().isInterrupted()) {
                    System.err.println("Out from cycle " + Thread.currentThread().isInterrupted());
                    System.err.println("WakeUp!");
                    break;
                }
            }
            System.err.println("Out " + Thread.currentThread().isInterrupted());
        });

        System.err.println("start...");

        thread.start();

        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // NEVER USE IT!!!
//        thread.stop();

        // USE THIS!
        thread.interrupt();

        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println();
        System.err.println("finish");
    }
}
