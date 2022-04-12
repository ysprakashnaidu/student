package com.student.studentdemo.repository;

import com.student.studentdemo.exception.StudentNotFoundException;
import com.student.studentdemo.model.dao.StudentDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.SQLException;

public interface StudentRepository extends JpaRepository<StudentDAO,Integer> {

    //public StudentDAO save(StudentDAO studentDAO) throws SQLException;
}
