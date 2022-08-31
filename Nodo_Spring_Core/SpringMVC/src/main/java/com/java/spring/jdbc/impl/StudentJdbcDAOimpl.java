package com.java.spring.jdbc.impl;


import com.java.spring.jdbc.StudentJdbcDAO;
import com.java.spring.jdbc.StudentJdbcDAOInterface;
import com.java.spring.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentJdbcDAOimpl implements StudentJdbcDAOInterface {
    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate = new JdbcTemplate();
    private String insertQuery;
    private String updateQuery;
    private String deleteQuery;
    @Autowired
    public PlatformTransactionManager platformTransactionManager;

    public void setUpdateQuery(String updateQuery) {
        this.updateQuery = updateQuery;
    }

    public void setDeleteQuery(String deleteQuery) {
        this.deleteQuery = deleteQuery;
    }

    public void setInsertQuery(String insertQuery) {
        this.insertQuery = insertQuery;
    }

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(Student st) {
        jdbcTemplate.update(insertQuery, st.getId(), st.getName(), st.getAge());
    }

    @Override
    public void update(Student st) {
        jdbcTemplate.update(updateQuery, st.getId(), st.getName(), st.getAge());
    }

    @Override
    public void delete(Student st) {
        jdbcTemplate.update(deleteQuery, st.getId(), st.getName(), st.getAge());
    }

    @Override
    public void createTableNotExit() {

    }
    @Override
    public List<Student> getAll() {
        String sql = "select * from student_kb";
        return this.jdbcTemplate.query(sql, new StudentJdbcDAO.StudentRowMapper());
    }
    private final static class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            try {
                Student st = new Student();
                st.setId(rs.getInt("st_id"));
                st.setName(rs.getString("st_name"));
                st.setAge(rs.getInt("st_age"));
                return st;
            } catch (Exception e) {
                return null;
            }
        }

    }

    public int[] add(List<Student> students) {
        List<Object[]> batch = new ArrayList<>();
        students.forEach(st -> batch.add(new Object[]{
                st.getId(), st.getName(), st.getAge()
        }));
        return jdbcTemplate.batchUpdate(insertQuery, batch);
    }

}
