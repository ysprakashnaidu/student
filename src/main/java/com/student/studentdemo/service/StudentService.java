package com.student.studentdemo.service;

import com.student.studentdemo.model.dao.StudentDAO;
import com.student.studentdemo.model.dto.StudentDTO;
import com.student.studentdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public int updateStudent(StudentDTO studentDTO) {
        StudentDAO studentDAO = new StudentDAO(studentDTO.getSid(),studentDTO.getSname(),studentDTO.getCourseId());
        return studentRepository.save(studentDAO).getSid();
    }
}
