package com.design.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton_1 = Singleton.getInstance();
        Singleton singleton_2 = Singleton.getInstance();

        System.out.println("First singleton instance: " + singleton_1);
        System.out.println("Second singleton instance: " + singleton_2);
    }
}
