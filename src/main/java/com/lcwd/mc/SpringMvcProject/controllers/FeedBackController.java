package com.lcwd.mc.SpringMvcProject.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class FeedBackController {
//    @RequestMapping(value = "/feedbacks",method = RequestMethod.GET)
    @GetMapping("/feedbacks")
    public List<String> getFeedBacks(){
        List<String> feedbacks = Arrays.asList(
                "Good Course",
                "Nice one",
                "Valuable thing"
        );
        return feedbacks;
    }
    @PostMapping("/create-feedback")
    public  String createFeedback(){
        System.out.println("feedback created");
        return "created feedback";
    }
    /*
    * @PutMapping
    * @DeleteMapping
    * @PatchMapping
    *
    * */

}
