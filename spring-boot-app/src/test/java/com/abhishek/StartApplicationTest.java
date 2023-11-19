package com.abhishek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StartApplicationTest {

    @Test
    void testApplicationStarts() {
        StartApplication application = new StartApplication();
        assertTrue(application.start(), "Application should start successfully");
    }
}
