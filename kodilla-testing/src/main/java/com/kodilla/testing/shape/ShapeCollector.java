package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShapeCollector {
    private Shape shape;
     private int field;
    public List<Shape> myObj= new ArrayList<>();


    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        myObj.add(shape);
    }

    public boolean removeFigure (Shape shape){
        boolean result = false;
        if(myObj.contains(shape)){
            myObj.remove(shape);
            result = true;
        }
        return result;
    }

    public void getFigure(int i){
        System.out.println("Object on the position: "+i+" is: "+myObj.get(i));
    }

    public void showFigures(){
        for(int i=0;i<myObj.size();i++){
            System.out.print(myObj.get(i));
            if(i != myObj.size()-1) System.out.print(", ");
        }
        System.out.println();

    }
    public int getFigureQuantity(){
        return myObj.size();
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shape=" + shape +
                ", field=" + this.field +
                ", myObj=" + myObj +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeCollector collector = (ShapeCollector) o;
        return field == collector.field && Objects.equals(shape, collector.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, field);
    }
}

