package com.student.studentdemo.exception;

public class StudentNotFoundException  extends  RuntimeException{

     public StudentNotFoundException(String message){
         super(message);
     }
}
