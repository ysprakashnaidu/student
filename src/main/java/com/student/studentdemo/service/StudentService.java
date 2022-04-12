package com.student.studentdemo.service;

import com.student.studentdemo.model.dto.StudentDTO;

public interface StudentService {

   int updateStudent(StudentDTO studentDTO) throws  RuntimeException;
}
