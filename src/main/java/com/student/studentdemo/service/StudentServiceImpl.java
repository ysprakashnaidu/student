package com.student.studentdemo.service;

import com.student.studentdemo.model.dao.StudentDAO;
import com.student.studentdemo.model.dto.StudentDTO;
import com.student.studentdemo.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class StudentServiceImpl implements  StudentService{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public int updateStudent(StudentDTO studentDTO) throws  RuntimeException {
        StudentDAO studentDAO = new StudentDAO(studentDTO.getSid(),studentDTO.getSname(),studentDTO.getCourseId());

           return studentRepository.save(studentDAO).getSid();

    }
    @Override
    public List<StudentDTO> getAllStudents() throws  RuntimeException {
        List<StudentDAO> studentDAOS = studentRepository.findAll();
        List<StudentDTO> studentDTOS = studentDAOS.stream().map(
                studentDAO -> new StudentDTO(studentDAO.getSid(),studentDAO.getSname(),studentDAO.getCourseId())
        ).collect(Collectors.toList());
        return studentDTOS;
    }
}
