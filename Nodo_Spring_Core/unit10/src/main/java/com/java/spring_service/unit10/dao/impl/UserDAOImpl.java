package com.java.spring_service.unit10.dao.impl;

import com.java.spring_service.unit10.dao.UserDAO;
import com.java.spring_service.unit10.model.User;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component("userDAO")
public class UserDAOImpl implements UserDAO {
//    private  final  static Logger LOGGER = LoggerFactory.getLogger();
        private LocalSessionFactoryBean sessionFactory;

        @Autowired
         public void setSessionFactory(LocalSessionFactoryBean sessionFactory) {
            this.sessionFactory = sessionFactory;
          }

    @Override
    public List<User> listUser() {

        return null;
    }
}
