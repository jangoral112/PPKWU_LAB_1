package com.jango.zadanie_1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ReverseServiceTest {

    @Autowired
    private ReverseService reverseService;

    @Test
    public void shouldReturnReversedString() {
        // Given
        String stringToReverse = "a123456789C0";

        // When
        String result = reverseService.reverseString(stringToReverse);

        // Then
        String expectedString = "0C987654321a";

        assertEquals(expectedString, result);
    }

}
