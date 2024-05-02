package com.kodilla.patterns.strategy.social;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User alex = new YGeneration("Alex");
        User thomas = new ZGeneration("Thomas");

        //When
        String johnMayChoose = john.sharePost();
        System.out.println("John may choose: " + johnMayChoose);
        String alexMayChoose = alex.sharePost();
        System.out.println("Alex may choose: " + alexMayChoose);
        String thomasMayChoose = thomas.sharePost();
        System.out.println("Thomas may choose: " + thomasMayChoose);

        //Then
        assertEquals("(Facebook publisher) choose Facebook", johnMayChoose);
        assertEquals("(Twitter publisher) choose Twitter", alexMayChoose);
        assertEquals("(Snapchat publisher) choose Snapchat", thomasMayChoose);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John");

        //When
        String johnMayChoose = john.sharePost();
        john.setChoice(new TwitterPublisher());
        johnMayChoose = john.sharePost();

        //Then
        assertEquals("(Twitter publisher) choose Twitter", johnMayChoose);

    }
}
