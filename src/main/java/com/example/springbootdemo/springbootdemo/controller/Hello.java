package com.example.springbootdemo.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Hello  {


    @RequestMapping("/")
    public String hello(){

        return "<h1> Hello world !</h1> <a href=\"about\"> ABOUT ME </a>";
    }
@RequestMapping("/about")
    public String about(){
        return "<h1> Everything about me </h1>";

    }

}
