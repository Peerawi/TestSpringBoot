package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/DemoStudent")
public class StudentController {

    @GetMapping("/list")
    public List<DemoStudent> getStudents() {
        List<DemoStudent> students = new ArrayList<>();
        students.add(new DemoStudent("Alice", 22));
        students.add(new DemoStudent("Bob", 23));
        students.add(new DemoStudent("Charlie", 24));
        return students;
    }
}
