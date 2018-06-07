package com.jnshu.model;

import java.io.Serializable;

/**
 * @program: Srping_RMI
 * @description: 学生实体类
 * @author: Mr.xweiba
 * @create: 2018-06-07 21:33
 **/

public class Student implements Serializable {
    // 服务端与客户端序列化UID必须一致 数据回传时需通过该值反序列化
    private static final long serialVersionUID = 3998655951027955616L;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
