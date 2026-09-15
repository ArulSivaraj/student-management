package com.example.learning.scholar_management.repository;

import com.example.learning.scholar_management.*;
import com.example.learning.scholar_management.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}