package com.example.fullstackproject;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id")
    private Long id;

    @Column(name="course_name", nullable=false)
    private String name;

    @ManyToOne
    @JoinColumn(name="student_id", referencedColumnName = "Student_id")
    private Student student;


}
