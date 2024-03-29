package com.lesson8;

import java.io.IOException;

public class Ex2 {
    private static volatile boolean flag = true;

    public static void main(String[] args) {
        new ThreadFlagReader().start();
        new ThreadFlagSetter().start();
    }

    public static class ThreadFlagReader extends Thread {
        @Override
        public void run() {
            System.err.println("waiting...");
            while (flag) {
            }
            System.err.println("Gogogo...");
        }
    }

    public static class ThreadFlagSetter extends Thread {
        @Override
        public void run() {
            try {
                int k = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            flag = false;

            System.err.println("Flag is down");
        }
    }
}
