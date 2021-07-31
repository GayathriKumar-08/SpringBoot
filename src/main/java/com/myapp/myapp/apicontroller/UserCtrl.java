package com.myapp.myapp.apicontroller;
import com.myapp.myapp.entity.User;
import com.myapp.myapp.repository.Userrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserCtrl {
    @Autowired
    private Userrepo brepo;

    @PostMapping(value = "/bank", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> submitData(@RequestBody User bank) {
        System.out.println("Insertion method!!!");
        System.out.println(bank);
                       
                       brepo.save(bank);
                System.out.println("Employee details:" + bank);
                System.out.println("Successfully inserterd");
                return new ResponseEntity<User>(bank, HttpStatus.CREATED);
            }

            @PutMapping(value = "/bank/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
            public ResponseEntity<User> updateEmployee(@PathVariable int id ,@RequestBody User bd){
                System.out.println(bd);
                brepo.save(bd);
               // eService.persitEmployee(emp);
               return new ResponseEntity<User>(bd, HttpStatus.OK);
            }
    }
    
