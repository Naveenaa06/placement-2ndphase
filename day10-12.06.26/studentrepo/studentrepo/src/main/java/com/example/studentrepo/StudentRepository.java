package com.example.studentrepo;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private final List<StudentModel> students = new ArrayList<>();
    public List<StudentModel> findAll(){
        return students;
    }
    public void save(StudentModel s){
        students.add(s);
    }
}
