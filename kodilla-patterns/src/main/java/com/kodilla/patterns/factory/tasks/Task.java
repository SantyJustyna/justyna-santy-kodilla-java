package com.kodilla.patterns.factory.tasks;

import java.util.Set;

public interface Task {
    boolean executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}
