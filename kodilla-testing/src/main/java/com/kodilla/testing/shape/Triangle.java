package com.kodilla.testing.shape;

public class Triangle implements Shape{

    String name ;
    int field;

    public Triangle(String name, int field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return field;

    }
}
