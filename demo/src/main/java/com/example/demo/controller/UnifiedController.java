package com.example.demo.controller;

import com.example.demo.model.DemoName;
import com.example.demo.model.UserForm;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UnifiedController {

    // 1️⃣ @RequestParam
    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Guest") String name) {
        return "Hello " + name;
    }

    // 2️⃣ @RequestBody
    @PostMapping("/echo")
    public String echo(@RequestBody DemoName name) {
        return "Received name: " + name.getName();
    }

    // 3️⃣ @PathVariable
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") int id) {
        return "User ID (PathVariable): " + id;
    }


    // 5️⃣ @Valid สำหรับ validate entity
    @PostMapping("/user")
    public String createUser(@Valid @RequestBody UserForm user) {
        return "User created: " + user.getName() + ", Age: " + user.getAge();
    }
}
