package com.student.studentInfo.exception;

public class TeacherNotFoundException extends RuntimeException{
    public TeacherNotFoundException(String msg){
        super(msg);
    }
}
