package com.webapp.service;

import com.webapp.dao.UserDAO;
import com.webapp.entity.User;
import org.apache.log4j.Logger;

import javax.transaction.Transactional;
import java.util.List;

public class UserSvcImpl implements UserSvc {

    final Logger log = Logger.getLogger(getClass());
    private final UserDAO userDAO;

    public UserSvcImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> list() {
        return userDAO.list();
    }
}
