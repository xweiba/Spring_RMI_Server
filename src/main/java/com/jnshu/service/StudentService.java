package com.jnshu.service;

import com.jnshu.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getRencentStudent(int count);
    void saveStudent(Student student);
    Student getStudent(long id);
}
