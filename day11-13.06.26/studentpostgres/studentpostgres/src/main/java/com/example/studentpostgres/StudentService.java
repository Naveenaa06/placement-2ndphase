package com.example.studentpostgres;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository srepo;
    private final CourseRepository crepo;

    public StudentService(StudentRepository srepo,
                          CourseRepository crepo) {
        this.srepo = srepo;
        this.crepo = crepo;
    }

    public List<Student> getAllStudents() {
        return srepo.findAll();
    }

    public Student addStudent(Student student) {
        return srepo.save(student);
    }

    public List<Course> getAllCourses() {
        return crepo.findAll();
    }

    public Course addCourse(Course course) {
        return crepo.save(course);
    }
}