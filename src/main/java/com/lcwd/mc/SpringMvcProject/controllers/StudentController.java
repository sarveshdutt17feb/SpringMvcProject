package com.lcwd.mc.SpringMvcProject.controllers;

import com.lcwd.mc.SpringMvcProject.models.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    //create student
    //we are receiving data in json format
    //json---> java object ==> deserialization
    //java object ---> json ===> serialization
    //springboot handles serialization with the help of (i.e all is being done by jackson)
    @PostMapping("/create")
    public Student createStudent(@RequestBody List<Student> students){

        System.out.println(students.size());
        System.out.println(students.get(0));
        //we have to create student
//        Map<String,Object> data = new HashMap<>();
//        data.put("content",students);
//        data.put("date",new Date());
        return students.get(0);
    }
}
