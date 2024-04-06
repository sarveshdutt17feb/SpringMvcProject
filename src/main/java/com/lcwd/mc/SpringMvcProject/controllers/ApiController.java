package com.lcwd.mc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloApi(){
        return "Hello , how are you";
    }
    @RequestMapping(value = "/user",method = RequestMethod.GET)

    public List<String> getUserData(){
        return Arrays.asList("Ram","shyam","chikku");

    }

    @RequestMapping(value = "/create-user",method = RequestMethod.POST)
    public String createuser(){
        System.out.println("creating user");
        return "creating user";
    }
}
