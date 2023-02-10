package com.student.studentInfo.controller;

import com.student.studentInfo.model.StudentDTO;
import com.student.studentInfo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/saveStu")
    public String saveStudent(@RequestBody StudentDTO studentDTO){
        studentService.getStudentInfo(studentDTO);
        return "ok";
    }

    /*@GetMapping("/getStudentList")
    public ResponseEntity<?> getStudentDetails(){
        Map<String, String> map = new HashMap<>();
        map = studentService.getTeacherInfo(map);
        return new ResponseEntity(map, HttpStatus.OK);
    }*/
}
