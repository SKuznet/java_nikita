package com.lesson7.generic;

public class HorseService {
    public static void main(String[] args) {
        Horse buraya = new Horse(20, "Buraya", true, true);
        Horse sizaya = new Horse(30, "Sizaya", true, false);

        print(buraya, O -> O.getSpeed());
        print(buraya, O -> O.getName());
        print(sizaya, O -> O.getName());
        print(sizaya, O -> O.getSpeed());
    }

    private static void print(Horse horse, Get get) {
        System.out.println(get.get(horse));
    }
}
