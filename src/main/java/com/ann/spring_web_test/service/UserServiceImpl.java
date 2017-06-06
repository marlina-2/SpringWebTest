package com.ann.spring_web_test.service;

import com.ann.spring_web_test.dao.UserDao;
import com.ann.spring_web_test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ann on 30.05.17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public void addUser(User user) {
       userDao.addUser(user);
    }

    @Override
    public User getUser(User user){


        return userDao.getUser(user);
    }
}
