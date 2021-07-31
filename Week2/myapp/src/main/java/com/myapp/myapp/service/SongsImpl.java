package com.myapp.myapp.service;

import javax.transaction.Transactional;

import com.myapp.myapp.entity.Song;
import com.myapp.myapp.repository.Songrepo;

import org.springframework.stereotype.Service;
@Service
@Transactional
public class SongsImpl implements SongSer {

    private Songrepo srepo;
    @Override
    public void saveData(Song s) {
       
        srepo.save(s);
    }
    
}
