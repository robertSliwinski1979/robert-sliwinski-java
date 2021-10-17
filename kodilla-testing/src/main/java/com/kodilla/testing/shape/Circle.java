package com.kodilla.testing.shape;

public class Circle implements Shape{
    String name ;
    int field;

    public Circle(String name, int field) {
       //Shape shape = new Circle();
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
