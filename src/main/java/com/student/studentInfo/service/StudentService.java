package com.student.studentInfo.service;

import com.student.studentInfo.model.StudentDTO;

import java.util.Map;

public interface StudentService {

    void getStudentInfo(StudentDTO studentDTO);

    Map<String, Object> getTeacherInfo(Map<String, Object> params);
}
