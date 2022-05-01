package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    String taskName;
    String whatToBuy;
    double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        taskName = taskName+", has been executed";
        return taskName;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        String name = taskName;
        if(name.contains("executed")) return true;
        else return false;
    }

}
