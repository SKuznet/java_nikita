package com.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s.toLowerCase());

    }

    private String getResult()  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String result = null;

        try {
            result = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
