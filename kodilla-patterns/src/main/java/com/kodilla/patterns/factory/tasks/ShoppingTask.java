package com.kodilla.patterns.factory.tasks;

import java.util.HashSet;
import java.util.Set;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean executed;


    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        executed = true;
        return executed;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (executed) {
            return true;
        } else {
            return false;
        }
    }
}
