package com.jango.zadanie_1.service;

public class ReverseService {

    public String reverseString(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }
}
