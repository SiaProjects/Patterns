package com.design.Adapter;

/**
 * КруглыеКолышки совместимы с КруглымиОтверстиями.
 */

public class RoundPeg {

    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
