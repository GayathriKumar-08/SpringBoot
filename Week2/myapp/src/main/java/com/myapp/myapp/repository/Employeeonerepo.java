package com.myapp.myapp.repository;

import java.util.List;

import com.myapp.myapp.entity.EmployeePhoneJoin;
import com.myapp.myapp.entity.Employeeone;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public class Employeeonerepo {

    public void save(EmployeePhoneJoin emp) {
    }
    
    // @Query("select new com.myapp.myapp.entity.EmployeePhoneJoin(e.id,e.name,ep.pNumber) from Employee e LEFT JOIN e.phones ep where e.id  = ep.emp.id")
    // public List<EmployeePhoneJoin> getEmployees();
}
