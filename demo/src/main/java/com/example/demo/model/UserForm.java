package com.example.demo.model;

import jakarta.validation.constraints.*;

public class UserForm {

    @NotBlank(message = "Name can not blank")
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    private int age;

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
