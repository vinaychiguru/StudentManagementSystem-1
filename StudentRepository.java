package com.edubridge.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edubridge.springboot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
