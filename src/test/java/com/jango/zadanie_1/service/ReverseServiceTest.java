package com.jango.zadanie_1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseServiceTest {

    private final ReverseService reverseService = new ReverseService();

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
