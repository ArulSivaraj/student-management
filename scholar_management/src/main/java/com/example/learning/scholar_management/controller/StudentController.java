package com.example.learning.scholar_management.controller;

import org.springframework.web.bind.annotation.*;
import com.example.learning.scholar_management.entity.Student;
import org.springframework.http.ResponseEntity;
import com.example.learning.scholar_management.service.StudentService;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController{

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return ResponseEntity.ok("Student created successfully");
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentService.getStudentById(id);
        if(student != null){
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable Long id, @RequestBody Student student){
        studentService.updateStudent(id, student);
        return ResponseEntity.ok("Student updated successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student deleted successfully");
    }
}