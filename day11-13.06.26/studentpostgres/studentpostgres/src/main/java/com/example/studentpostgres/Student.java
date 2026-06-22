package com.example.studentpostgres;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;

    private String studentname;

    private Long cid;

    // Required by JPA
    public Student() {
    }

    // Convenience constructor
    public Student(String studentname, Long cid) {
        this.studentname = studentname;
        this.cid = cid;
    }

    // Getters

    public Long getSid() {
        return sid;
    }

    public String getStudentname() {
        return studentname;
    }

    public Long getCid() {
        return cid;
    }

    // Setters

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }
}