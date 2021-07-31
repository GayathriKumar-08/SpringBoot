package com.myapp.myapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    // @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    // private Employeeone emp;

    private String pNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // public Employeeone getEmp() {
    //     return emp;
    // }

    // public void setEmp(Employeeone emp) {
    //     this.emp = emp;
    // }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    
    public Phone() {
    }

    public Phone(int id, String pNumber) {
        this.id = id;
       // this.emp = emp;
        this.pNumber = pNumber;
    }

    @Override
    public String toString() {
        return "Phone [id=" + id + ", pNumber=" + pNumber + "]";
    }

   
    
}