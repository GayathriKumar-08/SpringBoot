package com.myapp.myapp.repository;

import java.util.List;

import com.myapp.myapp.entity.CreditCard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Creditcardrepo extends JpaRepository<CreditCard,Integer>{

    public void deleteById(int id);
    
    public List<CreditCard> findAll();

    public List<CreditCard> findById(int id);

    
}
