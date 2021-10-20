package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private int field;
    private String name="square";

    public Square( int field) {
        this.field = field;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public int getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return field == square.field && name.equals(square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, name);
    }

    @Override
    public String toString() {
        return  name ;
    }
}
