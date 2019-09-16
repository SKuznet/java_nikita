package com.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String location = reader.readLine();
        Pizza pizza;

        if (location.equals("ny")) {
            pizza = new PizzaNY();
        } else {
            pizza = new PizzaMoscow();
        }

        pizza.washHands();

        AbstractPizza abstractPizza = new PizzaMoscow();

        Animal.getStaticInfo();
    }
}
