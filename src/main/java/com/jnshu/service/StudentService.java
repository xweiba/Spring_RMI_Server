package com.jnshu.service;

import com.jnshu.model.Student;


public interface StudentService {
    void saveStudent(Student student);
    Student getStudent(long id);
}
