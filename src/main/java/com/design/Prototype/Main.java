package com.design.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesClone = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.color = "blue";
        circle.radius = 30;
        shapes.add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 1;
        rectangle.y = 2;
        rectangle.color = "red";
        rectangle.width = 3;
        rectangle.height = 6;
        shapes.add(rectangle);

        shapes.forEach(item -> shapesClone.add(item.clone()));

        System.out.println("Init shapes: ");
        shapes.forEach(System.out::println);

        System.out.println("Copy shapes: ");
        shapesClone.forEach(System.out::println);
    }
}
