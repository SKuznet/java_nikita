package com.lesson8.join;

public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int duration) {
        super(name);
        this.duration = duration;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.err.println(getName() + " interrupted");
            return;
        }

        System.out.println(getName() + " activated");
    }
}
