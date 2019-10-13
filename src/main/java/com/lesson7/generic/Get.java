package com.lesson7.generic;

@FunctionalInterface
public interface Get<T> {
    T get(Horse horse);
}
