package com.example.demo.model;

public class DemoStudent {
    private String name;
    private int age;

    // ✅ Constructor ที่คุณต้องมี
    public DemoStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ✅ Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
