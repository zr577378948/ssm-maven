package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zr on 2018/5/7.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Integer insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public Integer delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public Integer update(User user) {
        return userDao.update(user);
    }

    @Override
    public User queryByUsername(User user) {
        return userDao.queryByUsername(user);
    }

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }


}
