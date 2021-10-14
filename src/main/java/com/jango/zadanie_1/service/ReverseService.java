package com.jango.zadanie_1.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseService {

    public String reverseString(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }
}
