package Garbige.Lambda;

import java.util.ArrayList;

public class Delta {
    public void aPark(Plane l1){
        System.out.println("Model of plane: "+l1.model + ", Speed = " + l1.speed + ", Altitude = " + l1.altitude + ", Capacity = " + l1.capacity + ", Number of plane: " + l1.number);
    }

    void printPlane(ArrayList<Plane> arr1, int speed){
        for(Plane l1: arr1){
            if (l1.speed > speed){
                aPark(l1);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Plane> arr = new ArrayList<>();
        Plane delta = new Plane("B-747",850,12500,550, "RA854");
        Plane aeroflot = new Plane("A330", 800,12000,350,"RA789");
        Plane klm = new Plane("A340",830,12600,380,"RA921");
        arr.add(delta);
        arr.add(aeroflot);
        arr.add(klm);
        Delta d = new Delta();
        System.out.println("V > 300");
        d.printPlane(arr, 300);
        System.out.println("V > 830");
        d.printPlane(arr,830);
        System.out.println("V > 860");
        d.printPlane(arr,860);

    }
}
