package com.design.Builder;

public class Director {

    public void createPersonTemplate(Builder builder) {
        builder.firstName("Ivan").secondName("Ivanov").age(18);
    }
}
