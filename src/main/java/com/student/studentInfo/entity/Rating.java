package com.student.studentInfo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "RATING")
@Setter
@Getter
@ToString
public class Rating {
    @Id
    @Column(name = "TEACHER_ID", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;

    @Column(name = "RATING_VALUE")
    private String value;

    public Rating(){}

}
