package com.wlk.demo.service;

import com.wlk.demo.pojo.User;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();

    User getOneUser(Integer id);

}
