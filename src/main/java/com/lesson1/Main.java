package com.lesson1;

public class Main {
    static Integer val = null;
    // 1 byte - 8 bit
    byte aByte = 0;
    // 2 byte - 16 bit
    short aShort = 0;
    // 4 byte - 32 bit
    int anInt = 0;
    // 8 byte - 64 bit
    long aLong = 0;
    // 4 byte
    float aFloat = 0.0F;
    // 8 byte
    double aDouble = 0.0D;
    char aChar = 'a';
    boolean aBoolean = false;

    public static void main(String[] args) {
        String a = "10";
        Integer count1 = Integer.parseInt(a);

        short count = 0;
        System.out.println(count);
        Main main = new Main();
        System.out.println(main.aChar);
    }

    private short getSum(short a, short b) {
        return (short) (a + b);
    }

    private long getSum(int a, long b){
        return a + b;
    }
}
