package com.ann.spring_web_test.dao;

import com.ann.spring_web_test.model.User;

/**
 * Created by ann on 30.05.17.
 */
public interface UserDao {
    void addUser(User user);

    User getUser(User user);
}
