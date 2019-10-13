package Garbige.Help.Plane;

public class Grumann extends Plane {
    @Override
    public void fly() {
        int Vmax = 350;
        int capacity = 10;
        int altitude = 1000;
        System.out.println("Fly Boeing. V = " + Vmax + ", with " + capacity +" on board, and altitude = " + altitude);
    }
}
