package com.java.spring_service.unit10.controllers;

import com.java.spring_service.unit10.dao.UserDAO;
import com.java.spring_service.unit10.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    private UserDAO userDAO;

    @GetMapping("/list/users")
    public List<User> listUser() {
        return  userDAO.listUser();
    }
}
