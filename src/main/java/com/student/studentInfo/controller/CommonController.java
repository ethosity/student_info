package com.student.studentInfo.controller;

import com.student.studentInfo.api.request.Response;
import com.student.studentInfo.entity.Student;
import com.student.studentInfo.entity.Subject;
import com.student.studentInfo.model.SubjectDTO;
import com.student.studentInfo.service.CommonService;
import com.student.studentInfo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    CommonService commonService;

    @RequestMapping("/subjectList")
    public Response subjectList(){
        return commonService.getSubjectList();
    }

    @RequestMapping("/ratingList")
    public Response ratingList(){
        return commonService.getRatingList();
    }
}
