package com.kodilla.patterns.singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog(){
        //Given
        logger = Logger.INSTANCE;
        logger.log("loglogloglog");

        //When
        String lastLog = logger.getLastLog();

        //Then
        assertEquals("loglogloglog", lastLog);
    }
}
