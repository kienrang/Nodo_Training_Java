package com.java.spring.jdbc;

import com.java.spring.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.StatementCallback;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StudentJdbcDAO {
    private static Logger LOGGER;
    private DataSource dataSource;
    JdbcTemplate jdbcTemplate;

    private String insertQuery;

    ResultSet rs;
    private String updateQuery;

    private String deleteQuery;

    @Autowired
    private PlatformTransactionManager platformTransactionManager;

    void insert(int id, String name, int age) {
        jdbcTemplate.update(insertQuery, id, name, age);
    }

    void update(String name, int age) {
        jdbcTemplate.update(updateQuery, age, name);
    }

    void delete(String name) {
        jdbcTemplate.update(deleteQuery, name);
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createTableIfNotExist() throws SQLException {
        DatabaseMetaData dbmd = dataSource.getConnection().getMetaData();
        ResultSet rs = dbmd.getTables(null, null, "STUDENT_KienBEER", null);
        if (rs.next()) {
            System.out.println("tables: " + rs.getString("STUDENT_KienBEER") + "already exist !!");
            return;
        }
        jdbcTemplate.execute("create table STUDENT_KB(st_id int primary key,  st_name varchar(1000), st_age int)");
    }


    public void setInsertQuery(String insertQuery) {
        this.insertQuery = insertQuery;
    }

    public void setUpdateQuery(String query) {
        this.updateQuery = query;
    }

    public void setDeleteQuery(String query) {
        this.deleteQuery = query;
    }

    public int totalRecord() {
        return jdbcTemplate.execute(new StatementCallback<Integer>() {
            @Override
            public Integer doInStatement(Statement stmt) throws SQLException {
                rs = stmt.executeQuery("select count(*) from student_kb");
                return rs.next() ? rs.getInt(1) : 0;
            }
        });
    }

    public final static class StudentRowMapper implements RowMapper<Student> {
        JdbcTemplate jdbcTemplate;

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

    public List<Student> loadStudent(String name) {
        String sql = "select * from student_kb where  st_name like '%" + name + "%'";
        return this.jdbcTemplate.query(sql, new StudentRowMapper());
    }


    //    page 11
    public int[] add(List<Student> students) {
        List<Object[]> batch = new ArrayList<>();
        students.forEach(st -> batch.add(new Object[]{
                st.getId(), st.getName(), st.getAge()
        }));
        return jdbcTemplate.batchUpdate(insertQuery, batch);
    }

    public void save(String name, Integer age) {
        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = platformTransactionManager.getTransaction(def);

        String countQuery = "Select count(*) from student_kb";
        try {
            Integer total = jdbcTemplate.queryForObject(countQuery, Integer.class);
            System.out.println("Before save data " + total);

            platformTransactionManager.commit(status);
        } catch (Exception e) {
            platformTransactionManager.rollback(status);
            Integer total = jdbcTemplate.queryForObject(countQuery, Integer.class);
            System.out.println("After rollback " + total);
        }

    }
}

