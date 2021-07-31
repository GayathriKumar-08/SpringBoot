package com.myapp.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name="instruments")
public class Instrument {
    @Id
    @Column(name="instrument_id")
    private int id;
    @Column(name="instrument_name")
    private String iname;
    @Column(name="instrument_price")
    private double iprice;
    
    public Instrument() {
    }

    public Instrument(int id, String iname, double iprice) {
        this.id = id;
        this.iname = iname;
        this.iprice = iprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public double getIprice() {
        return iprice;
    }

    public void setIprice(double iprice) {
        this.iprice = iprice;
    }

    @Override
    public String toString() {
        return "Instrument [id=" + id + ", iname=" + iname + ", iprice=" + iprice + "]";
    }

    
}
