package com.example.springbootdemo.springbootdemo.error;

import com.example.springbootdemo.springbootdemo.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler{
    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage employeeNotFoundExceptionHandler(EmployeeNotFoundException ex){
         ErrorMessage em= new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
         return em;
        }

}
