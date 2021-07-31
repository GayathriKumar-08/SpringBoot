package com.myapp.myapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Song extends Instrument{
    @Column(name="Song_name")
    private String sname;
    @Column(name="Song_id")
    private int sid;
    @Column(name="song_release_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date srd;

     Song(){}

    public Song(int id, String iname, double iprice, String sname, int sid, Date srd) {
        super(id, iname, iprice);
        this.sname = sname;
        this.sid = sid;
        this.srd = srd;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Date getSrd() {
        return srd;
    }

    public void setSrd(Date srd) {
        this.srd = srd;
    }

    @Override
    public String toString() {
        return "Song [sid=" + sid + ", sname=" + sname + ", srd=" + srd + "]";
    }

     

}
