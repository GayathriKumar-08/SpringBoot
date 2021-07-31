package com.myapp.myapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BookIdentity implements Serializable{
    @Column(name="id")
    int id;
    @Column(name = "b_id")
    String bid;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBid() {
        return bid;
    }
    public void setB_id(String bid) {
        this.bid = bid;
    }
  
    public void setBid(String bid) {
        this.bid = bid;
    }
    public BookIdentity() {
    }
    public BookIdentity(int id, String bid) {
        this.id = id;
        this.bid = bid;
    }
    @Override
    public String toString() {
        return "BookIdentity [bid=" + bid + ", id=" + id + "]";
    }

}
