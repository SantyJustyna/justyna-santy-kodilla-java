package com.kodilla.patterns2.observer.homework;

public class Teacher implements Observer {
    private final String teacherName;
    private int updateCount;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(StudentTasks studentTasks) {
        System.out.println(teacherName + ": New task in " + studentTasks.getName() + "\n" +
                " (total: " + studentTasks.getTasks().size() + " tasks.)");
        updateCount++;
    }
}
