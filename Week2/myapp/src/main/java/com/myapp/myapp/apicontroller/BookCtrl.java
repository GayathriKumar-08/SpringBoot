package com.myapp.myapp.apicontroller;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import com.myapp.myapp.entity.Book;
import com.myapp.myapp.repository.BookRepo;
import com.myapp.myapp.service.BookSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Transactional
public class BookCtrl {
    @Autowired
    private BookRepo brepo;

    // @Autowired
    // private BookSer bservice;

    @PostMapping(value = "/book", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Book> submitData(@RequestBody Book b) {
        System.out.println("Insertion method!!!");
        System.out.println(b);
       brepo.save(b);
        System.out.println("Book details:" + b);
        System.out.println("Successfully inserterd");
        return new ResponseEntity<Book>(b,HttpStatus.CREATED);
    }


    // @GetMapping("/book")
    // @ResponseStatus(HttpStatus.OK)
    // public Book getBookByCompositeKey(@RequestParam final int id,
    //                                   @RequestParam final String bid)
    //         throws EntityNotFoundException {
    //     return bservice.getBookByKey(id, bid);
    // }
}
