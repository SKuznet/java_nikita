package com.lesson8;

public class DaemonEx implements Runnable {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new DaemonEx());
            daemon.setDaemon(true);
            daemon.start();
        }

        System.out.println("All daemons started");

        try {
            Thread.sleep(305);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
