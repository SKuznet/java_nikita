package com.lesson8.join;

public class Main {

    public static void main(String[] args) {
        Sleeper sleepy = new Sleeper("Sleepy", 1500);
        Sleeper grumpy = new Sleeper("Grumpy", 1500);

        Joiner doopey = new Joiner("Doopey", sleepy);
        Joiner doc = new Joiner("Doc", grumpy);

        grumpy.interrupt();
    }
}
