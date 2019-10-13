package com.lesson7.horses;

public class HorseService {
    public static void main(String[] args) {
        Horse risak = new Horse(20, "Risak", true, true);
        Horse sizaya = new Horse(30, "Sizaya", true, false);

        pringSpeed(risak, O -> O.getSpeed());
        pringName(risak, O -> O.getName());

        pringSpeed(sizaya, U -> U.getSpeed());
        pringName(sizaya, HORSE -> HORSE.getName());
    }

    private static void pringName(Horse horse, GetName getName) {
        System.out.println(getName.get(horse));
    }

    private static void pringSpeed(Horse horse, GetSpeed getSpeed) {
        System.out.println(getSpeed.get(horse));
    }
}
