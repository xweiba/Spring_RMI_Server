package com.jnshu.service.impl;

import com.jnshu.model.Student;
import com.jnshu.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Srping_RMI
 * @description: 接口实现类
 * @author: Mr.xweiba
 * @create: 2018-06-07 23:04
 **/
@Service
public class StudentServiceImpl implements StudentService{

    public void saveStudent(Student student) {
        System.out.println("保存学生数据: " + student.toString());
    }

    public Student getStudent(long id) {
        Student student = new Student();
        student.setPassword("服务端获取客户端传输的setPassword为: " + id);
        student.setUsername("这是服务器端学生名称");
        System.out.println("获取学生数据: " + student.toString());
        return student;
    }
}
