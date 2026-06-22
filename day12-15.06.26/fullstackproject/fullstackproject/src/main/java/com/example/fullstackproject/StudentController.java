package com.example.fullstackproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService service;
    public StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping
    public Student create(@RequestBody Student s){
        return service.save(s);

    }
    @GetMapping
    public List<Student> all(){
        return service.all();
    }
}
