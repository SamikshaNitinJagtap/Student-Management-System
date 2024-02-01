package com.project.studentmanagementsystem.repository;

import com.project.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


// no need to write @Repository because JpaRepository<Student,Long> already contains that annotation
public interface StudentRepository extends JpaRepository<Student,Long> {


}
