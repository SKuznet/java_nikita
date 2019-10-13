package Garbige.Help.Plane;

public class Boeing extends Plane {
    @Override
    public void fly() {
        int Vmax = 950;
        int capacity = 500;
        int altitude = 12500;
        System.out.println("Fly Boeing. V = " + Vmax + ", with " + capacity +" on board, and altitude = " + altitude);
    }
}
