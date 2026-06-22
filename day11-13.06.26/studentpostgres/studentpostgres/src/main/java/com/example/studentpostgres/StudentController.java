package com.example.studentpostgres;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return service.getAllCourses();
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return service.addCourse(course);
    }
}