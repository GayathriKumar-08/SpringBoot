package com.myapp.myapp.service;

import java.util.List;
//import java.util.Optional;

import javax.transaction.Transactional;

import com.myapp.myapp.entity.Student;

import org.springframework.stereotype.Service;

@Service
@Transactional
public interface StudentManager {
    public List<String> getName();

    public void persitStudent(Student stud);

    public List<Student> fetchAllStudent();

    public void deleteById(Long id);

    //public Student deleteId(int id);

    //public Student saveData(Student reg);
}
