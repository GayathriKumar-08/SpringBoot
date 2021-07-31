package com.myapp.myapp.apicontroller;

import com.myapp.myapp.entity.EmployeePhoneJoin;
import com.myapp.myapp.entity.Employeeone;
import com.myapp.myapp.repository.Employeeonerepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeOneCtrl {
    @Autowired
    private Employeeonerepo erepo;
    // @Autowired
    //  private CreditcardService cService;


    @PostMapping(value = "/emp", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeePhoneJoin> submitData(@RequestBody EmployeePhoneJoin emp) {
        System.out.println("Insertion method!!!");
        System.out.println(emp);
        erepo.save(emp);
        System.out.println("Employee details:" + emp);
        System.out.println("Successfully inserterd");
        return new ResponseEntity<EmployeePhoneJoin>(emp,HttpStatus.CREATED);
    }
}
