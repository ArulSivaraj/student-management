package com.example.learning.scholar_management.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController{

    @GetMapping("/get")
    
    public String getall(){
        return "Hi from controller";
    }

    @GetMapping("/gettest")
    public String getTest(){
        return "Hi from controllerssss";
    }
}