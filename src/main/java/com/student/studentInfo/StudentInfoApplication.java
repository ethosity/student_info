package com.student.studentInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.student.studentInfo"})
public class StudentInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoApplication.class, args);
		System.out.println(display());
	}

	private static String display(){
		return "Spring boot application started!";
	}
}
