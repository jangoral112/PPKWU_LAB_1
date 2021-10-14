package com.jango.zadanie_1.controller;

import com.jango.zadanie_1.service.ReverseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    @Autowired
    private ReverseService reverseService;

    @PostMapping("/reverse/{string}")
    public ResponseEntity<String> reverseString(@PathVariable("string") String string) {
        return ResponseEntity.ok(reverseService.reverseString(string));
    }
}
