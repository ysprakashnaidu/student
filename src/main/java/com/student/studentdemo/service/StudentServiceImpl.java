package com.student.studentdemo.service;

import com.student.studentdemo.model.dao.StudentDAO;
import com.student.studentdemo.model.dto.StudentDTO;
import com.student.studentdemo.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentServiceImpl implements  StudentService{

    @Autowired
    StudentRepository studentRepository;

    public int updateStudent(StudentDTO studentDTO) throws  RuntimeException {
        StudentDAO studentDAO = new StudentDAO(studentDTO.getSid(),studentDTO.getSname(),studentDTO.getCourseId());

           return studentRepository.save(studentDAO).getSid();

    }
}
