package com.cross.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class AController {

    @GetMapping("/test")
    public String runMyTest() {
        return "Test Worked";
    }

}
