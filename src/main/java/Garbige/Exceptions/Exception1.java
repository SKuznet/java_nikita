package Garbige.Exceptions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exception1  {
    public static void main(String[] args) throws Exception2 {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int limitOfArray = sc.nextInt();
        addToArray addToArray = new addToArray();
        addToArray.addArr(limitOfArray);

    }
}
