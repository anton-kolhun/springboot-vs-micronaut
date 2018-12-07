package com.example;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class GreetingControllerTest {

    @Inject
    BookClient bookClient;

    @Test
    void testGreetingService() {
        bookClient.getAll();
    }
}
