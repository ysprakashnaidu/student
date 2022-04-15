package com.student.studentdemo.service;

import com.student.studentdemo.model.dto.StudentDTO;

import java.util.List;

public interface StudentService {

   int updateStudent(StudentDTO studentDTO) throws  RuntimeException;
   List<StudentDTO> getAllStudents() throws RuntimeException;
}
