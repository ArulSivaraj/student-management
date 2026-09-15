package com.example.learning.scholar_management.service;

import com.example.learning.scholar_management.entity.*;
import com.example.learning.scholar_management.repository.*;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override 
    public void createStudent(Student student){
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override 
    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    @Override 
    public void updateStudent(Long id, Student student){
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if(existingStudent != null){
            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setCourse(student.getCourse());
            existingStudent.setAge(student.getAge());
            studentRepository.save(existingStudent);
        }
    }

    @Override
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}