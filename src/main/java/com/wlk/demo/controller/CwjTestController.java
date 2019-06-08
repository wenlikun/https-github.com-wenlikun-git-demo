package com.wlk.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CwjTestController {

    @RequestMapping(value = "test" , name = "测试")
    public String demo(){
        return "test";
    }


    public static void main(String[] args) {
        System.out.println("test");
    }

}
