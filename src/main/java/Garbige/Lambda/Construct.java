package Garbige.Lambda;

import java.util.ArrayList;

public class Construct {
    public void lambda(){
        Delta d = new Delta();
        ArrayList<Plane> p = new ArrayList<>();
        Plane luftgansa = new Plane("A320", 800,11500,160,"RA571");
        Plane s7 = new Plane("B737", 850,12000,160,"RA521");
        Plane uralairlines = new Plane("A319", 800,11500,140,"RA871");
        p.add(luftgansa);
        p.add(s7);
        p.add(uralairlines);
        d.printPlane(p, 400);
    }
}
