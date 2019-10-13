package Garbige.Help.Plane;

public class Plane {

    public void construct(){
        Boeing boeing = new Boeing();
        Airbus airbus = new Airbus();
        Grumann grumann = new Grumann();
        Plane p = new Plane();
        p.fly();
        boeing.fly();
        airbus.fly();
        grumann.fly();

    }
    public void fly(){
        System.out.println("Fly from Plane");
    }
}
