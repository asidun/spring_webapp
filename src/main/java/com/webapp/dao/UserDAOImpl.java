package com.webapp.dao;

import com.webapp.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {

    final SessionFactory sf;
    public UserDAOImpl(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    public void save(User user) {
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(user);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> list() {
        Session session = sf.openSession();
        List<User> userList = session.createQuery("select from User").list();
        session.close();
        return userList;
    }
}
