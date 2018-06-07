package com.jnshu.serverSide;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: Srping_RMI
 * @description: 服务器端
 * @author: Mr.xweiba
 * @create: 2018-06-07 23:57
 **/

public class ServerSide {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext-SMI-Server.xml");
    }
}
