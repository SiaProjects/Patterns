package com.design.Builder;

public class PersonBuilder implements Builder {

    private String firstName;
    private String secondName;
    private int age;


    @Override
    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public PersonBuilder secondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    @Override
    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public Person getResult() {
        return new Person(firstName, secondName, age);
    }
}
