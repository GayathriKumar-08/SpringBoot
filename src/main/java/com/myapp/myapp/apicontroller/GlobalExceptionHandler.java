package com.myapp.myapp.apicontroller;

import java.util.Date;
import java.util.Random;

import com.myapp.myapp.entity.BankError;
import com.myapp.myapp.entity.ErrorClass;
import com.myapp.myapp.entity.InvalidEmployee;
import com.myapp.myapp.entity.UserNotMatchException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

    @ExceptionHandler(value = {InvalidEmployee.class})
    public ResponseEntity<ErrorClass> handlerExceptions(InvalidEmployee e,WebRequest r)
    {
        ErrorClass ec=new ErrorClass();
        ec.setDt(new Date());
        ec.setErrcode("ERR"+new Random().nextInt());
        ec.setMessage(e.toString().concat(", Reload or Try again later"));
        ec.setStatus("Failed....");
       
        System.err.println("Error caused......");
        e.printStackTrace();
        return new ResponseEntity<ErrorClass>(ec,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {UserNotMatchException.class})
    public ResponseEntity<ErrorClass> handlerExceptions(UserNotMatchException e,WebRequest r)
    {
        ErrorClass ec=new ErrorClass();
        ec.setDt(new Date());
        ec.setErrcode("ERR"+new Random().nextInt());
        ec.setMessage(e.toString().concat(", "));
        ec.setStatus("Failed....");
       
        System.err.println("Error caused......");
        e.printStackTrace();
        return new ResponseEntity<ErrorClass>(ec,HttpStatus.BAD_REQUEST);
    }
    
}
