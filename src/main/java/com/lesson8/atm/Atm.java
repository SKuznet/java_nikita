package com.lesson8.atm;

public class Atm {
    static int money = 100;

    // toilet
    static synchronized void getMoney(int amount) {
        if (amount <= money) {
            try {
                Thread.sleep(1123);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money -= amount;
            System.err.println("All Ok! New amount: " + money);
        } else {
            System.err.println("Not enough money!");
        }
    }

    public static void main(String[] args) {
        new Thread(() -> {
            System.err.println("Nike");
            getMoney(50);
        }).start();
        new Thread(() -> {
            System.err.println("Jack");
            getMoney(50);
        }).start();
        new Thread(() -> {
            System.err.println("Mikkey");
            getMoney(50);
        }).start();
    }
}
