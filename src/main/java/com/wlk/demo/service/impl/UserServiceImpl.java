package com.wlk.demo.service.impl;

import com.wlk.demo.dao.UserDao;
import com.wlk.demo.pojo.User;
import com.wlk.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getOneUser(Integer id) {
        return userDao.getOneUser(id);
    }
}
