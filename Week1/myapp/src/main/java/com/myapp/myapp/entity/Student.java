package com.myapp.myapp.entity;

import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class Student {
    @Id
    private int id;
    private String studname;
    private String studresult;
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStudname() {
        return studname;
    }
    public void setStudname(String studname) {
        this.studname = studname;
    }
    public String getStudresult() {
        return studresult;
    }
    public void setStudresult(String studresult) {
        this.studresult = studresult;
    }
 
    @Override
    public String toString() {
        return "Student [id=" + id + ", studname=" + studname + ", studresult=" + studresult + "]";
    }
   
    
    
}
