package com.myapp.myapp.repository;

import com.myapp.myapp.entity.Book;
import com.myapp.myapp.entity.BookIdentity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepo extends JpaRepository<Book,BookIdentity> {


    //public Book findByBookIdBid(int id, String bid);
    
}
