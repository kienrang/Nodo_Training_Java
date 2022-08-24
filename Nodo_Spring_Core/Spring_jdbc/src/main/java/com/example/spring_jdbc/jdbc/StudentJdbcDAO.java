package com.example.spring_jdbc.jdbc;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class StudentJdbcDAO {
    private static Logger LOGGER;
    private DataSource dataSource;
    JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createTableIfNotExist() throws SQLException {
        DatabaseMetaData dbmd =  dataSource.getConnection().getMetaData();
        ResultSet rs =  dbmd.getTables(null, null, "STUDENT_KienBEER", null);
        if (rs.next()){
            System.out.println("tables: "+rs.getString("STUDENT_KienBEER")+"already exist !!");
            return;
        }
        jdbcTemplate.execute("create table STUDENT_KienBEER(st_id int primary key,  st_name varchar(1000), st_age int)");
    }
}
