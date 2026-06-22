package com.example.studentpostgres;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    private String coursename;

    private Long sid;

    // Required by JPA
    public Course() {
    }

    // Convenience constructor
    public Course(String coursename, Long sid) {
        this.coursename = coursename;
        this.sid = sid;
    }

    // Getters

    public Long getCid() {
        return cid;
    }

    public String getCoursename() {
        return coursename;
    }

    public Long getSid() {
        return sid;
    }

    // Setters

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }
}