package com.lcwd.mvc.SpringMvcProject.controllers;

import com.lcwd.mvc.SpringMvcProject.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    //create student
    //we are receiving data in json format
    //json---> java object ==> deserialization
    //java object ---> json ===> serialization
    //springboot handles serialization with the help of (i.e all is being done by jackson)
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody List<Student> students){

        System.out.println(students.size());
        System.out.println(students.get(0));
        //we have to create student
//        Map<String,Object> data = new HashMap<>();
//        data.put("content",students);
//        data.put("date",new Date());
        Student student = students.get(0);
        student.setDept("Test");
//        ResponseEntity<Student> response = new ResponseEntity<>(student, HttpStatus.CREATED);
        ResponseEntity<Student> response = ResponseEntity.status(HttpStatus.OK).body(student);
        return response;
    }
}
