package com.lcwd.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    //request handler
    @RequestMapping("/login")
    public String showLoginPageHandler(){
        return "login";
    }
}
