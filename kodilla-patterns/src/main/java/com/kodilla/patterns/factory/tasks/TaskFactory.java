package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task checkTask(final String taskClass){
        return switch (taskClass) {
            case SHOPPINGTASK -> new ShoppingTask("Shopping task", "apples", 10);
            case PAINTINGTASK -> new PaintingTask("Painting task", "blue", "kitchen");
            case DRIVINGTASK -> new DrivingTask("Driving task", "Warsaw", "my car");
            default -> null;
        };
    }
}
