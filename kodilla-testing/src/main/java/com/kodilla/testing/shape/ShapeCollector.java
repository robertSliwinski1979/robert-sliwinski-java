package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShapeCollector {
    private Shape shape;
     private int field;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
        this.field = field;
    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "shape=" + shape +
                ", field=" + this.field +
                ", myObj=" + myObj +
                '}';
    }

    public List<Shape> myObj= new ArrayList<>();

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

}

