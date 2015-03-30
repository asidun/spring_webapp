package com.webapp.service;

import com.webapp.entity.User;

import java.util.List;

public interface UserSvc {

    public void save(User user);
    public List<User> list();
}
