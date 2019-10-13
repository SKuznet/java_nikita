package Garbige;

public class Gthree {
    public static void main(String[] args) {
        int a = 1;
        final int b = a;

        a = 2;
        System.out.println(a + "" + b);
    }
}
