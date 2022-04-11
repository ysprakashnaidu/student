package com.student.studentdemo.controller;

import com.student.studentdemo.model.dto.StudentDTO;
import com.student.studentdemo.model.entity.Student;
import com.student.studentdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/updateStudent")
    public int updateStundentDetails(@RequestBody  Student student) {
        StudentDTO studentDTO = new StudentDTO(student.getSid(),student.getSname(),student.getCourseId());
        return studentService.updateStudent(studentDTO);
    }

}
