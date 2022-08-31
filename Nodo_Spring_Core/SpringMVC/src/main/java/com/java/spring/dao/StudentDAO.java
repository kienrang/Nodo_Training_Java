package com.java.spring.dao;

import com.java.spring.student.Student;

import java.util.List;

public interface StudentDAO {
    public int insert(Student st);

    public List<Student> getAll();
}
