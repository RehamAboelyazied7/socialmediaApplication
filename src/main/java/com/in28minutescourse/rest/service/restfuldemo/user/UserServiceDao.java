package com.in28minutescourse.rest.service.restfuldemo.user;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//using in memory list

@Repository
public class UserServiceDao {
    private List<User> users = new ArrayList<>();
    private int counter = 3;


    public UserServiceDao() {
        users.add(new User(1, "Reham", new Date()));
        users.add(new User(2, "Sarah", new Date()));
        users.add(new User(3, "Ahmed", new Date()));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User saveUser(User user) {
        if (user.getId() == null) {
            user.setId(++counter);
        }
        users.add(user);
        return user;
    }

    public User findUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
