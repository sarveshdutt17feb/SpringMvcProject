package com.lcwd.mc.SpringMvcProject.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class SuperMan {
    //RequestMpping is used for mapping the url with method
    @RequestMapping("/about")
     public String aboutRequestHandler(){
        System.out.println("processing about request");
        return "about";
     }
    @RequestMapping("/services")
        public String serviceRequestHandler(){
            System.out.println("processing service request");
            return "services";
        }

}
