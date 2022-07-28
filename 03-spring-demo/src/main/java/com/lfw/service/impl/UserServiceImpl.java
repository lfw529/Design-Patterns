package com.lfw.service.impl;

import com.lfw.dao.UserDao;
import com.lfw.service.UserService;

public class UserServiceImpl implements UserService {

    //声明一个UserDao类型的变量
    private UserDao userDao;

    public UserServiceImpl() {
        System.out.println("userService被创建了");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("UserService ...");
        userDao.add();
    }
}


