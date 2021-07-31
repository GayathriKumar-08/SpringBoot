package com.myapp.myapp.repository;

import com.myapp.myapp.entity.Instrument;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Instrumentrepo extends JpaRepository<Instrument,Long> {
    
}
