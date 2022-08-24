package com.example.spring_jdbc.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        JdbcApp jdbc = (JdbcApp) context.getBean("StudentJdbcDAO");
        System.out.println("created bean" +jdbc);
    }
}
