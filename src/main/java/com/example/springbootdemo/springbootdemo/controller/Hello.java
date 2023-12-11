package com.example.springbootdemo.springbootdemo.controller;

import com.example.springbootdemo.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Hello {


    @RequestMapping("/")
    public String hello() {

        return "<h1> Hello world !</h1> <a href=\"about\"> ABOUT ME </a>";
    }

    @RequestMapping("/about")
    public String about() {
        return "<h1> Everything about me </h1>";

    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User getUser() {
        User myUser= new User("myoSpringBoot","12345","myo@sboot.com","MYO","MYO");


        return myUser;
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUser(@PathVariable(name = "id") String idenifier){


        return "The Requested User Id : " +idenifier ;
    }


}
