package com.java.spring;

import com.java.spring.jdbc.impl.StudentJdbcDAOimpl;

public class test {
    public static void main(String[] args) {
        StudentJdbcDAOimpl studentJdbcDAOimpl = new StudentJdbcDAOimpl();
        studentJdbcDAOimpl.getAll().forEach(st -> System.out.println(st.toString()));
    }
}
