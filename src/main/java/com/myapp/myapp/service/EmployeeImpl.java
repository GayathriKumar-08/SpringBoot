package com.myapp.myapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.myapp.myapp.entity.Employee;
import com.myapp.myapp.repository.Employeerepo;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeImpl implements EmployeeService {

    List<Employee> emp=new ArrayList<>();

    private Employeerepo erepo;

    @Override
    public Employee saveData(Employee emp1) {
         return erepo.save(emp1);
    }
 
    @Override
    public Employee updateById(int id, Employee emp1) {
        
        return erepo.save(emp1) ;
    }

    // @Override
    // public Employee getEmpById(int id) {
     
    //     return erepo.findById(id).get();
    // }

    // @Override
    // public void deleteEmpById(int id) {
    //     erepo.deleteById(id);
    // }


  

   

}
