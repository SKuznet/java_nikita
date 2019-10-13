package com.lesson6;

public class Ex6 {
    public static void main(String[] args) {

    }

    private String getInfo(String val) {
//        String result = null;
//        try {
//            result = val.toLowerCase();
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }
//
//        return result;

        if (val != null) {
            return val.toUpperCase();
        }

        throw new IllegalArgumentException("val should not be null");
    }
}
