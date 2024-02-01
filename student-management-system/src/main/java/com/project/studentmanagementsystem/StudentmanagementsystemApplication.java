package com.project.studentmanagementsystem;

import com.project.studentmanagementsystem.entity.Student;
import com.project.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}


	private StudentService studentService;

	@Autowired
	public StudentmanagementsystemApplication(StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Samiksha","Jagtap","samiksha@gmail.com");
//		Student student2 = new Student("Yash","Gosavi","yash@gmail.com");
//		Student student3 = new Student("Lubdha","Chaudhari","lubdha@gmail.com");
//
//		studentService.saveStudent(student1);
//		studentService.saveStudent(student2);
//		studentService.saveStudent(student3);
	}
}
