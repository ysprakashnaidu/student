package com.student.studentdemo.repository;

import com.student.studentdemo.model.dao.StudentDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentDAO,Integer> {
}
