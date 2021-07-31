package com.myapp.myapp.apicontroller;

import java.util.List;

import com.myapp.myapp.entity.CreditCard;

import com.myapp.myapp.repository.Creditcardrepo;
import com.myapp.myapp.service.CreditcardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CCcontroller {

    @Autowired
    private Creditcardrepo crepo;
    // @Autowired
    //  private CreditcardService cService;


    @PostMapping(value = "/ccard", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CreditCard> submitData(@RequestBody CreditCard cc) {
        System.out.println("Insertion method!!!");
        System.out.println(cc);
        crepo.save(cc);
        System.out.println("Employee details:" + cc);
        System.out.println("Successfully inserterd");
        return new ResponseEntity<CreditCard>(cc,HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/ccard/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
     public void deleteCreditCardBtID(@PathVariable int id)
     {
         crepo.deleteById(id);
         System.out.println("deleted successfully....");
     }

     @GetMapping(value = "/ccard/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<List<CreditCard>> getEmp(@PathVariable int id){
         return new ResponseEntity<List<CreditCard>>(crepo.findById(id), HttpStatus.OK);
     }

     @GetMapping(value = "/ccard", produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<List<CreditCard>> fetchAllCC(){
         return new ResponseEntity<List<CreditCard>>(crepo.findAll(),HttpStatus.OK);
     }

     @PutMapping(value = "/ccard/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<CreditCard> updateEmployee(@PathVariable int id ,@RequestBody CreditCard ccd){

        // if(!(ccd.getCardholder()==ccd.getBdetails().getAccholdername())){
        //     throw new UserNotMatchException();
        // }
        // else{
         System.out.println(ccd);
         crepo.save(ccd);
        // }
        return new ResponseEntity<CreditCard>(ccd, HttpStatus.OK);
     }
 
}
