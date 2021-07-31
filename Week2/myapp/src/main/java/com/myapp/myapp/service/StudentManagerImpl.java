package com.myapp.myapp.service;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


import javax.transaction.Transactional;

import com.myapp.myapp.entity.Student;
import com.myapp.myapp.repository.StudentRepo;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentManagerImpl implements StudentManager{
    List<Student> st=new ArrayList<>();

    private StudentRepo srepo;

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

    @Override
    public void deleteById(Long id) {
      
         srepo.deleteById(id);
    }

    // @Override
    // public Student saveData(Student stud) {
    //     return srepo.save(stud);
    // }

    // @Override
    // public Student deleteId(int id) {
    //     Iterator<Student> iterator = st.iterator();
    //     while(iterator.hasNext())
    //     {
    //         Student std=iterator.next();
    //     if(std.getId()==id)
    //     {
    //     iterator.remove();
    //     return std; 
    //     }
    //     }
    //     return null;
    //     }
    }
    