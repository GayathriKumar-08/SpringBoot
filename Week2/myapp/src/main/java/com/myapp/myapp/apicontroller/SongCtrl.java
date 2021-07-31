package com.myapp.myapp.apicontroller;

import java.util.List;

import com.myapp.myapp.entity.Instrument;
import com.myapp.myapp.entity.Song;
import com.myapp.myapp.repository.Songrepo;
import com.myapp.myapp.service.SongSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
@RestController
@RequestMapping("/api")
public class SongCtrl {
    @Autowired
    private Songrepo srepo;
    // @Autowired
    //  private SongSer sservice;


    @PostMapping(value = "/song", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Song> submitData(@RequestBody Song song) {
        System.out.println("Insertion method!!!");
        System.out.println(song);
        srepo.save(song);
        System.out.println("Employee details:" + song);
        System.out.println("Successfully inserterd");
        return new ResponseEntity<Song>(song,HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/song/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
     public void deleteCreditCardBtID(@PathVariable int id)
     {
         srepo.deleteById(id);
         System.out.println("deleted successfully....");
     }

     @GetMapping(value = "/song/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<List<Song>> getEmp(@PathVariable int id){
         return new ResponseEntity<List<Song>>(srepo.findById(id), HttpStatus.OK);
     }

     @GetMapping(value = "/song", produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<List<Instrument>> fetchAllCC(){
         return new ResponseEntity<List<Instrument>>( srepo.findAll(),HttpStatus.OK);
     }
}
