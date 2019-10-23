package com.lesson9.result;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String> {
    private int id;

    @Override
    public String call() throws Exception {
        return "result from " + Thread.currentThread().getName() + " " + this.getClass().getName() + " " + id;
    }

    public TaskWithResult(int id) {
        this.id = id;
    }
}
