package com.example.demo.controller;

import com.example.demo.model.DemoName;
import com.example.demo.model.DemoResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Peerawit Yadtaisong") String name) {
        return String.format("Hello %s", name);
    }

    @PostMapping("/hello")
    public DemoResponse hello(@RequestBody DemoName request) {
        String name = request.getName();
        return new DemoResponse("Hello, " + name);
    }
}
