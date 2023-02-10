package com.student.studentInfo.service;

import com.student.studentInfo.model.StudentDTO;

import java.util.Map;

public interface TeacherService {

    Map<String, Object> getTeacherInfo(Map<String, Object> params);

    Map<String, Object> getTeacherInfo1(Map<String, Object> params);
}
