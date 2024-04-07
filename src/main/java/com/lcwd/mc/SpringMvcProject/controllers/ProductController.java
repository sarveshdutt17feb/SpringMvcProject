package com.lcwd.mc.SpringMvcProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/getProduct")
    public String getProduct(@RequestParam("productName") String name,@RequestParam(value = "productRating",defaultValue = "0",required = false
    ) int rating,@RequestParam("productId")int id ){

        System.out.println("productName "+name);
        System.out.println("productRating "+rating);
        System.out.println("productId "+id);

        return "this is testing product url";
    }
}
