package com.wlk.demo.controller;

import com.wlk.demo.pojo.User;
import com.wlk.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectAll")
    public List<User> getAll(){
        return userService.getAllUsers();
    }

    @RequestMapping("/getOne")
    public User getOne(@RequestParam(value = "id" , defaultValue = "1") Integer id){
        return userService.getOneUser(id);
    }


    @RequestMapping("/test")
    public void test(){
        System.out.println("test");
    }

}
