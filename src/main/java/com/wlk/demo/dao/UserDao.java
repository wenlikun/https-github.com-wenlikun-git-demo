package com.wlk.demo.dao;

import com.wlk.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> getAllUsers();

    User getOneUser(@Param("id") Integer id);

}
