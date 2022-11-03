package com.design.Builder;

public class Main {

    public static void main(String[] args) {

        PersonBuilder personBuilder = new PersonBuilder();
        Director director = new Director();

        director.createPersonTemplate(personBuilder);

        Person ivan = personBuilder.getResult();
        System.out.println(ivan);

        //==================================

        PersonBuilder builderTom = new PersonBuilder();
        Person tom = builderTom
                .firstName("Tom")
                .secondName("Holand")
                .getResult();

        System.out.println(tom);
    }
}
