package com.kodilla.testing.shape;

public class Triangle implements Shape {

    @Override
    public String getShapeName() {
        return "Circle";

    }

    @Override
    public String getField() {
        return "(a * h) / 2";
    }
}
