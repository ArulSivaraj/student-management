package com.example.learning.scholar_management.repository;

import com.example.learning.scholar_management.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentReposistory extends JpaRepository<Student, Long> {

}