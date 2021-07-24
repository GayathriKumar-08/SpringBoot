package com.myapp.myapp.service;

import java.util.List;

import com.myapp.myapp.entity.Student;

import org.springframework.stereotype.Service;
@Service
public interface StudentManager {
    public List<String> getName();

    public void persitStudent(Student stud);

    public List<Student> fetchAllStudent();
}
