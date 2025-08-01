package com.example.demo.controller;

import com.example.demo.model.DemoStudent;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/DemoStudent")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public List<DemoStudent> getStudents() {
        return studentService.getAllStudents();
    }
}
