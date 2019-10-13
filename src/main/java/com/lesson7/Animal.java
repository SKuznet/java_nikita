package com.lesson7;

@FunctionalInterface
public interface Animal {
    // only one abstract method on interface - it's functional interface
    public abstract String getInfo(String name);
}
