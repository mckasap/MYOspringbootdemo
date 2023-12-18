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
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public ErrorMessage employeeNotFoundExceptionHandler(EmployeeNotFoundException ex){
         ErrorMessage em= new ErrorMessage(HttpStatus.BAD_GATEWAY,ex.getMessage());
         return em;
        }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage GenericException(RuntimeException ex){
        ErrorMessage em= new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR,ex.getMessage());
        return em;
    }

}
