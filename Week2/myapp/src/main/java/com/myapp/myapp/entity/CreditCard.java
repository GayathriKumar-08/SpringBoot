package com.myapp.myapp.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="creditcard")
public class CreditCard {
    @Id
    @Column(name="id")
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="cardnumber")
    private int cardnumber;

    @Column(name="cardholder")
    private String cardholder;
    
    @Temporal(value=TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name="validto")
    private Date validto;

    @Transient
    @Column(name="cvv")
    private int cvv;
    
    @OneToOne(fetch = FetchType.EAGER,
                cascade = CascadeType.MERGE,
                optional = false)
    @JoinColumn(name="bankdetails",referencedColumnName = "id")
    private User bdetails;

    public CreditCard()
    {}



    public CreditCard(int id, int cardnumber, String cardholder, Date validto, int cvv, User bdetails) {
        this.id = id;
        this.cardnumber = cardnumber;
        this.cardholder = cardholder;
        this.validto = validto;
        this.cvv = cvv;
        this.bdetails = bdetails;
    }



    public User getBdetails() {
        return bdetails;
    }

    public void setBdetails(User bdetails) {
        this.bdetails = bdetails;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public Date getValidto() {
        return validto;
    }

    public void setValidto(Date validto) {
        this.validto = validto;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }



    @Override
    public String toString() {
        return "CreditCard [bdetails=" + bdetails + ", cardholder=" + cardholder + ", cardnumber=" + cardnumber
                + ", cvv=" + cvv + ", id=" + id + ", validto=" + validto + "]";
    }

    

    

    
}
