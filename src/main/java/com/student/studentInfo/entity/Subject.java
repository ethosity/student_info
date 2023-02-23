package com.student.studentInfo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "SUBJECT")
@Setter
@Getter
@ToString
public class Subject {
    @Id
    @Column(name = "SUBJECT_ID", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String subjectId;

    @Column(name = "SUBJECT_NAME")
    private String subjectName;

    public Subject(){}

}
