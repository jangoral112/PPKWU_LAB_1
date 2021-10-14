package com.jango.zadanie_1.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseService {

    public String reverseString(String string) {
        return new StringBuffer(string)
            .reverse()
            .toString();
    }
}
