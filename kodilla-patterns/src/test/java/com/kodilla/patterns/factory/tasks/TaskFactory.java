package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task MakeTask(final String makeTask){
        switch (makeTask){
            case ShoppingTask: return new ShoppingTask("purchase","coca-cola",2);
            case PaintingTask: return new PaintingTask("painting room","blue","ceiling");
            case DrivingTask: return new DrivingTask("driving","shop","car");
            default: return null;
        }
    }
}
