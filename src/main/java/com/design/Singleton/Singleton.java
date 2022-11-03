package com.design.Singleton;

public class Singleton {

    public static Singleton INSTANCE;

    private Singleton() {};

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
