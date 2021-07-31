package com.myapp.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
 
    @Id
    private int id;
    @Column(name="accno")
    private int accno;

    @Column(name="IFSC")
    private String ifsc;

    @Column(name="accholdername")
    private String accholdername;

    // @OneToOne(fetch = FetchType.LAZY,optional=false)
    // @JoinColumn(name="ccard",nullable = false)
    // private CreditCard ccard;

    public User(){}



    public User(int id, int accno, String ifsc, String accholdername) {
        this.id = id;
        this.accno = accno;
        this.ifsc = ifsc;
        this.accholdername = accholdername;
    }



    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getAccholdername() {
        return accholdername;
    }

    public void setAccholdername(String accholdername) {
        this.accholdername = accholdername;
    }



    @Override
    public String toString() {
        return "User [accholdername=" + accholdername + ", accno=" + accno + ", id=" + id + ", ifsc=" + ifsc + "]";
    }

    

    
    

}
