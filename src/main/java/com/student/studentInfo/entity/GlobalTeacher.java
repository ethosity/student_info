package com.student.studentInfo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "GLOBAL_TEACHER")
@Setter
@Getter
@ToString
public class GlobalTeacher {
    @Id
    @Column(name = "TEACHER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private Long teacherId;

    @Column(name = "TEACHER_NAME")
    private String teacherName;
    @Column(name = "SUBJECT_NAME")
    private String subjectName;
    @Column(name = "CITY_NAME")
    private String cityName;

    @Column(name = "LOCATION_NAME")
    private String locationName;
    @Column(name = "CLASS_NAME")
    private String className;

    public GlobalTeacher(){}

}
