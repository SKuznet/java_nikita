package com.lesson5;

public class PizzaMoscow extends AbstractPizza implements Pizza {
    @Override
    public void washHands() {
        System.out.println("Wash with soap");
    }

    @Override
    public void cook() {

    }

    @Override
    public void sendPizzaToClient() {

    }
}
