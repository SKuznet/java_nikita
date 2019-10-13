package Garbige.Help.Plane;

public class Airbus extends Plane {
    @Override
    public void fly() {
        int Vmax = 800;
        int capacity = 800;
        int altitude = 12000;
        System.out.println("Fly Boeing. V = " + Vmax + ", with " + capacity +" on board, and altitude = " + altitude);
    }
}
