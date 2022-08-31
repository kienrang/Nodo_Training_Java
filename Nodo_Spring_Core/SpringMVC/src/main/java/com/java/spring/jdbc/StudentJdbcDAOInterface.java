package com.java.spring.jdbc;

import com.java.spring.student.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentJdbcDAOInterface {
    public void setDataSource(DataSource dataSource);
    public void insert(Student st);
    public void update(Student st);
    public void delete(Student st);
    public void createTableNotExit();
    public List<Student> getAll();
}
