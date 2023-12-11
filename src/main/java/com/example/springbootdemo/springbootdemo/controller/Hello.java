package com.example.springbootdemo.springbootdemo.controller;

import com.example.springbootdemo.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
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
        User myUser = new User("myoSpringBoot", "12345", "myo@sboot.com", "MYO", "MYO");


        return myUser;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable(name = "id") String idenifier) {


        return "The Requested User Id : " + idenifier;
    }

    @GetMapping(value = "/user/{id}/{id2}")
    public String getUser(@PathVariable(name = "id") String idenifier,
                          @PathVariable("id2") String id2) {


        return "The Requested User Id : " + idenifier + ": " + id2;
    }

    @GetMapping("/query")
    public String QueryString(@RequestParam String name,
                              @RequestParam(name = "email",
                                      required = false,
                                      defaultValue = "") String emial) {

        return "the Query String : name=" + name + " email :"+emial;

    }

}
