package com.student.studentInfo.service;

import com.student.studentInfo.entity.Student;
import com.student.studentInfo.model.StudentDTO;
import com.student.studentInfo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService{

    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    public void getStudentInfo(StudentDTO studentDTO) {
        Student stuInfo = convertStudentDTOToStudent(studentDTO);
        studentRepository.save(stuInfo);
    }

    /**
     * @param params
     * @return
     */
    @Override
    public Map<String, Object> getTeacherInfo(Map<String, Object> params) {
        Map<String, Object> map = studentRepository.getTeacherDetails();
        return map;
    }

    private Student convertStudentDTOToStudent(StudentDTO studentDTO) {
        Student stu = new Student();
        stu.setFirstName(studentDTO.getFirstName());
        stu.setLastName(studentDTO.getLastName());
        stu.setLocation(studentDTO.getLocation());
        stu.setEmailId(studentDTO.getEmailId());
        stu.setPhoneNumber(studentDTO.getPhoneNumber());
        return stu;
    }
}
