package com.lcwd.mc.SpringMvcProject.controllers;

import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("/checkProduct/{productId}/{productName}/{productRating}")
    public String checkProduct(@PathVariable("productId")int id,@PathVariable("productRating")int rating,@PathVariable("productName")String name){
        System.out.println("productName "+name);
        System.out.println("productId "+id);
        System.out.println("productrating "+rating);
        return "this is checking the concept of path variable";
    }
}
