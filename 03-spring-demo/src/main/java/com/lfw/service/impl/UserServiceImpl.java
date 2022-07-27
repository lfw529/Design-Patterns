package com.lfw.service.impl;

import com.lfw.dao.UserDao;
import com.lfw.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("userServiceImpl ...");
        userDao.add();
    }
}

