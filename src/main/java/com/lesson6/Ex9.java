package com.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        try {
            reader1.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
