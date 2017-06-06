package com.ann.spring_web_test.service;

import com.ann.spring_web_test.model.User;

/**
 * Created by ann on 30.05.17.
 */
public interface UserService {

    void addUser(User user);

    User getUser(User user);
}
