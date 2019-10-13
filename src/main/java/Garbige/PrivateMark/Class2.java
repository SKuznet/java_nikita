package Garbige.PrivateMark;

import java.util.Arrays;

public class Class2 implements Refer  {


    public static void init(int a) {
        Class2 c = new Class2();
        System.out.println("Initialisation");
        String s = "createString";
        int i = a;
        int j = 9;
        c.nonStatic(s);
        tab(s,i);
        vararg(i,i);
        c.nonStatic(s);
        c.decode();
        c.create();
        c.createString();
    }

    private static void tab(String s, int i) {
        System.out.println(s);
        System.out.println(i);
    }
    public static void vararg(int...i){
        System.out.println(Arrays.toString(i));
    }


    public static void main(String[] args) {
        System.out.println("Start");
        start();
        String o = "Class1 start";
 //       print(o);
    }
    public static void start(){
        System.out.println("start Start");
        int a = 5;
        init(a);
    }
    public void nonStatic(String a){
        System.out.println("nonStatic start");
        System.out.println("s = " + a);
    }

    @Override
    public void decode() {
        System.out.println("decode start");
    }

    @Override
    public void create() {
        System.out.println("create start");
    }

    @Override
    public void createString() {
        System.out.println("createString start");
    }
}
