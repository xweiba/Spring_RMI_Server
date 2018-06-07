package com.jnshu.service;

import com.jnshu.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getRencentStudent(int count);
    public void saveStudent(Student student);
    public Student getStudent(long id);
}
