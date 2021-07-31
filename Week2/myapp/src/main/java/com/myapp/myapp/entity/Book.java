package com.myapp.myapp.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "book")
public class Book {

    @EmbeddedId
    BookIdentity identity;
    
    @Column(name="title")
    String title;
    @Column(name="author")
    String author;
    @Column(name="gender")
    String gender;
    public Book() {
    }
    public Book(BookIdentity identity, String title, String author, String gender) {
        this.identity = identity;
        this.title = title;
        this.author = author;
        this.gender = gender;
    }
    public BookIdentity getIdentity() {
        return identity;
    }
    public void setIdentity(BookIdentity identity) {
        this.identity = identity;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Book [author=" + author + ", gender=" + gender + ", identity=" + identity + ", title=" + title + "]";
    }
    
}

