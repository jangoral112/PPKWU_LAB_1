package com.jango.zadanie_1.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

@SpringBootTest
@AutoConfigureMockMvc
public class ReverseControllerFunctionalTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @SneakyThrows
    void testShouldReturnReversedString() {
        // Given
        String stringToReverse = "a123456789C0";

        // When
        MockHttpServletRequestBuilder requestBuilder = post("/reverse/" + stringToReverse);

        ResultActions result = mvc.perform(requestBuilder);

        // Then
        String expectedString = "0C987654321a";
        result.andExpect(content().string(expectedString));
    }

}
