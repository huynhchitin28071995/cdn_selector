package com.cdnselector.cdnselector.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin(value = "*")
public class HomeController {
    @GetMapping("/test")
    String home() {
        return "Spring is allready here!";
    }
}
