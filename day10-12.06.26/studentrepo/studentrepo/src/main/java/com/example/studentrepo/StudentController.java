package com.example.studentrepo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository repo = new StudentRepository();
    @GetMapping
    public List<StudentModel> getStudents(){
        return repo.findAll();
    }
    @PostMapping
    public StudentModel addStudent(@RequestBody StudentModel s){
        repo.save(s);
        return s;
    }
}
