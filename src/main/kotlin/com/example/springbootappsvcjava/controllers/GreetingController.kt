package com.example.springbootappsvcjava.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/")
    fun greeting(): String {
        return "Hello, World! v1.0"
    }
}
