package com.project.studentmanagementsystem.service;


import com.project.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    public static final String a ="a";
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
