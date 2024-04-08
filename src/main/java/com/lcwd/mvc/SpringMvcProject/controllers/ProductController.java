package com.lcwd.mvc.SpringMvcProject.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    Logger logger = LoggerFactory.getLogger(ProductController.class);
    @GetMapping("/getProduct")
    public String getProduct(@RequestParam("productName") String name,@RequestParam(value = "productRating",defaultValue = "0",required = false
    ) int rating,@RequestParam("productId")int id ){


        return "this is testing product url";
    }

    @RequestMapping("/checkProduct/{productId}/{productName}/{productRating}")
    public String checkProduct(@PathVariable("productId")int id,@PathVariable("productRating")int rating,@PathVariable("productName")String name){
        logger.error("productName {} ",name);
        logger.info("Product Rating{} ",rating);
        logger.warn("productId {} ",id);
        logger.debug("this is testing for debug");
        return "this is checking the concept of path variable";
    }
}
