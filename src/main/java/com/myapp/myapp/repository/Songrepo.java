package com.myapp.myapp.repository;

import com.myapp.myapp.entity.Instrument;
// import com.myapp.myapp.apicontroller.List;
import com.myapp.myapp.entity.Song;

import org.springframework.stereotype.Repository;
import java.util.List;

import javax.transaction.Transactional;

@Repository
public interface Songrepo extends Instrumentrepo{
   @Transactional
   public void deleteById(int id);

   public List<Song> findById(int id);

   public List<Instrument> findAll();
 
 
    
}
