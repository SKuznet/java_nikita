package Garbige.Office;

import java.util.Arrays;
import java.util.Random;

public class Director {
    public void choice(Secretary next){
 //       System.out.println("Choice start");

        Random r = new Random() ;
        if (r.nextBoolean() == true){
            System.out.println(next);
        }

    }
}
