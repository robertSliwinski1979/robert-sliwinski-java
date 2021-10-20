package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private int field;
    private String name="circle";

    public Circle(int field) {
        this.field = field;

    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public int getField() {
        return this.field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return field == circle.field && name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, name);
    }

    @Override
    public String toString() {
        return   name ;
    }
}
