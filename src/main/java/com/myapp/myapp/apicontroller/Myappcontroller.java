package com.myapp.myapp.apicontroller;


import java.util.List;



import com.myapp.myapp.entity.Student;


import com.myapp.myapp.service.StudentManager;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myappcontroller extends Basecontroller {
   // Logger logger = LoggerFactory.getLogger(Myappcontroller.class);

   @Autowired
    private StudentManager sservice;
    
    // @Autowired
    //   private StudentRepo srep;


    @GetMapping(value = "/names",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getName()
    {
        return new ResponseEntity<List<String>>(sservice.getName(),HttpStatus.OK);
    }
  
    @GetMapping(value = "/students/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> fetchById(@PathVariable int id) throws Exception {
        System.out.println(id);
        return new ResponseEntity<List<Student>>(sservice.fetchAllStudent(), HttpStatus.OK);
    }


    @GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> fetchAllStudent(){
       // System.out.println(id);
        return new ResponseEntity<List<Student>>(sservice.fetchAllStudent(), HttpStatus.OK);
    }

    @PostMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> addStudent(@RequestBody(required = false) Student stu){
        System.out.println(stu);
        sservice.persitStudent(stu);
        return new ResponseEntity<List<Student>>(sservice.fetchAllStudent(),HttpStatus.OK);
    }

    
    @PutMapping(value = "/students",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> updateStudent(@RequestBody Student stud){
        //logger.debug(stud.toString());
        System.out.println(stud);
        sservice.persitStudent(stud);
        return new ResponseEntity<List<Student>>(sservice.fetchAllStudent(),HttpStatus.OK);
    }
 
    // @DeleteMapping(value="/students/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<List<Student> > deleteById(@PathVariable Long id) throws Exception{
    //     return new ResponseEntity<List<Student>>(HttpStatus.OK);

    // }

    // @DeleteMapping("/users/{id}") 
    // public void deleteStudent(@PathVariable int id) throws NullPointerException
    // {
    //  sservice.deleteId(id);
    // }

    // @PostMapping("/employees")
    // public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee emp) {
    //   //@Valid Employee saveEmp = erepo.save(emp);
  
    // //   URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    // //       .buildAndExpand(saveEmp.getEmpid()).toUri();
  
    // //   return ResponseEntity.created(location).build();

    //     if(emp.getEmpid()==0 || emp.getEmpname()==" ")
    //     {
    //         throw new EmployeeNotFound();
    //     }
    //     else{
    //      System.out.println("Employee details:"+ emp);
    //      return new ResponseEntity<Employee>(emp,HttpStatus.OK);
    //     }
    // }
  

}
