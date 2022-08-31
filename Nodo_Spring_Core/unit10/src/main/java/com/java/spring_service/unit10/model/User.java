package com.java.spring_service.unit10.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_kb", uniqueConstraints = {@UniqueConstraint(columnNames = "username")} )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private int age;
    @Column(name = "groupId", nullable = false)
    private int getGroupId;
}
