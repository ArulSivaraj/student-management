package com.example.learning.scholar_management.service;

import com.example.learning.scholar_management.entity.*;
import java.util.*;

public interface StudentService {

    void createStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    void updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}