package com.student.studentdemo.controller;

import com.student.studentdemo.model.dto.StudentDTO;
import com.student.studentdemo.model.entity.Student;
import com.student.studentdemo.service.StudentServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class StudentController {

    private final StudentServiceImpl studentService;

    @PostMapping("/updateStudent")
    public ResponseEntity updateStundentDetails(@RequestBody Student student) {
        StudentDTO studentDTO = new StudentDTO(student.getSid(), student.getSname(), student.getCourseId());
        try {
            return ResponseEntity.ok(studentService.updateStudent(studentDTO));
        } catch (Exception exception) {
            log.error(exception.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Integer.valueOf(-1));
        }
    }
    @GetMapping("/allstudents")
    public List<StudentDTO> getAllStudentsDetails(){
        try {
            return (studentService.getAllStudents());
        } catch (Exception exception) {
            log.error(exception.getMessage());
            return Collections.EMPTY_LIST;
        }
    }



}
