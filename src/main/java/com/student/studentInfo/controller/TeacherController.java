package com.student.studentInfo.controller;

import com.student.studentInfo.api.request.Response;
import com.student.studentInfo.model.StudentDTO;
import com.student.studentInfo.service.StudentService;
import com.student.studentInfo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/getTeacherList")
    public Response getTeacherDetails(@RequestParam Map<String, Object> params){
        Map<String, Object> map = new HashMap<>();
        map = teacherService.getTeacherInfo(map);
        Response response = new Response();
        response.setData(map);
        return response;
    }

    @GetMapping("/getTeacherInfo")
    public Response getTeacherInfo(@RequestParam Map<String, Object> params){
        Map<String, Object> map = teacherService.getTeacherInfo1(params);
        Response response = new Response();
        response.setData(map);
        return response;
    }
}
