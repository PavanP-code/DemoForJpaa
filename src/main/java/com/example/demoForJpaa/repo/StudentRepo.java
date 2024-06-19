package com.example.demoForJpaa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoForJpaa.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
