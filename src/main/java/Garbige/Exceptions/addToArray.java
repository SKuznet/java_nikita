package Garbige.Exceptions;

public class addToArray {
    public void addArr(int a ) throws Exception2{
        if (a < 5 ){
            System.out.println("Good index");

        }
        else {
            throw new Exception2("Index error", a);

        }
    }
}
