package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.ForumUser;
import com.kodilla.patterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.JavaToolsForumTopic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        // Given
        StudentTasks johnBrownTasks = new JohnBrownTasks();
        StudentTasks peterCookTasks = new PeterCookTasks();

        Teacher johnSmith = new Teacher("John Smith");
        Teacher jamesKovalsky= new Teacher("James Kovalsky");

        johnBrownTasks.registerObserver(johnSmith);
        peterCookTasks.registerObserver(jamesKovalsky);

        // When
        johnBrownTasks.addTask("ArrayList practicing");
        johnBrownTasks.addTask("Queue practicing");
        johnBrownTasks.addTask("AOP");
        peterCookTasks.addTask("AOP");
        peterCookTasks.addTask("Observer");
        // Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, jamesKovalsky.getUpdateCount());

    }
}
