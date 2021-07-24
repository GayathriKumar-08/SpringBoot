package com.myapp.myapp.service;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Arrays;
import java.util.List;

import com.myapp.myapp.entity.Student;

import org.springframework.stereotype.Service;

@Service

public class StudentManagerImpl implements StudentManager{
    List<Student> st=new ArrayList<>();

    @Override
    public void persitStudent(Student stud) {
      st.add(stud);
        
    }

    @Override
    public List<Student> fetchAllStudent() {
        return st;
    }
    
    @Override
    public List<String> getName() {
        
        return Arrays.asList("Fasino","Royl-Enfield","Duke","R15");
    }
    
    }