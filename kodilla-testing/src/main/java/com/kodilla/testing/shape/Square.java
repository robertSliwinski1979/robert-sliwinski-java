package com.kodilla.testing.shape;

public class Square implements Shape{
    String name ;
    int field;

    public Square(String name, int field) {
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
