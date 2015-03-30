package com.webapp.dao;

import com.webapp.entity.User;

import java.util.List;

public interface UserDAO {

    void save(User user);
    List<User> list();
}
