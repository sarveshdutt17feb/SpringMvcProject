package com.lcwd.mc.SpringMvcProject.controllers;

import com.lcwd.mc.SpringMvcProject.models.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    //create student
    //we are receiving data in json format
    //json---> java object ==> deserialization
    @PostMapping("/create")
    public void createStudent(@RequestBody List<Student> students){

        System.out.println(students.size());
        System.out.println(students);
        //we have to create student
    }
}
