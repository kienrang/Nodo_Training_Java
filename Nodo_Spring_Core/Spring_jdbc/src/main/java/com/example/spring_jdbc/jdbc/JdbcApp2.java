package com.example.spring_jdbc.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JdbcApp2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanx.xml");
        StudentJdbcDAO jdbc = (StudentJdbcDAO) context.getBean("StudentJdbcDAO");
        System.out.println("created bean" +jdbc);

//        Thêm, Xửa, Xóa
//        jdbc.insert(6,"Kiên Bear", 15);
//        jdbc.update("Kiên Bear", 100);
//        jdbc.delete("Kiên 1");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập tên vào đây: ");
//        String name = sc.nextLine();
        System.out.println("Total: " + jdbc.totalRecord());
        jdbc.loadStudent("Kiên").forEach(st -> System.out.println(st.toString()));

        List<Student> list = new ArrayList<>();
        list.add(new Student(10, "Kiên 10", 21));
        list.add(new Student(11, "Kiên 11", 22));
        list.add(new Student(12, "Kiên 12", 27));
        int[] values = jdbc.add(list);

        for (int i = 0; i < values.length; i++) {
            System.out.println("add record" + i + ": " +  (values[i] == 0 ? "falsed" : "success"));
        }

        System.out.println("Total students is " + jdbc.totalRecord());



    }
}
