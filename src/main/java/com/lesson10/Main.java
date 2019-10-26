package com.lesson10;

import java.util.concurrent.TimeUnit;

public class Main {
    private static final Object key = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.err.println(i);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // notifyAll
            }

            // IllegalMonitorStateException
            synchronized (key) {
                key.notifyAll();
            }
        });

        System.err.println("start...");
        thread.start();

        // wait
        synchronized (key) {
            try {
                // IllegalMonitorStateException
                key.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.err.println("finish...");
    }


}
