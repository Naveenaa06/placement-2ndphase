package com.example.fullstackproject;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="students")
@Data //Generate getters, setters, toString(), equals(), and hashCode()
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Student_id")
    private Long id;

    @Column(name="Student_name",nullable = false,length = 20)
    private String name;
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="profile-id",referencedColumnName = "id")
    private Profile profile;*/

    @OneToMany(mappedBy = "student" , cascade = CascadeType.ALL)
    private List<Course> courses;

    @Column(name="Student_dept",nullable = false)
    private String dept;

}
