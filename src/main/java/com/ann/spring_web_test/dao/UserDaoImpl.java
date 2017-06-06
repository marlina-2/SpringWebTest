package com.ann.spring_web_test.dao;

import com.ann.spring_web_test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ann on 30.05.17.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private DataSource dataSource;

    @Override
    public void addUser(User user) {

        Connection connection = null;
        String query = "INSERT INTO USERS (USERNAME, PASSWORD, EMAIL) VALUES (?, ?, ?)";
        PreparedStatement statement = null;

        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public User getUser(User user) {
        Connection connection = null;
        String query = "SELECT USERNAME, PASSWORD, EMAIL FROM USERS WHERE USERNAME=? AND PASSWORD=?";
        PreparedStatement statement = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            ResultSet resultSet = statement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        User userFromDB = new User();
        while (resultSet.next()) {

        }


    }


}
