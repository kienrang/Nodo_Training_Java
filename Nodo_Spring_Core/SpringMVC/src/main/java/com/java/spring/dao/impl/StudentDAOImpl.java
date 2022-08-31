package com.java.spring.dao.impl;

import com.java.spring.dao.StudentDAO;
import com.java.spring.jdbc.StudentJdbcDAO;
import com.java.spring.jdbc.StudentJdbcDAOInterface;
import com.java.spring.student.Student;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDAOImpl implements StudentDAO, DisposableBean {

    @Autowired
    private StudentJdbcDAOInterface dao;

    @Override
    public int insert(Student st)  {
        this.dao.insert(st);
        return 0;
    }

    @Override
    public List<Student> getAll() {
        return this.dao.getAll();
    }


    @Override
    public void destroy() throws Exception {

    }
}
