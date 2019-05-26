package com.wlk.demo.controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Controller
public class HelloController {

    @RequestMapping({"/" , "/index.html"})
    public String hello(){
        return "index";
    }


    //@RequestMapping(value = "/login" , method = RequestMethod.POST)
    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username ,
                        @RequestParam("password") String password ,
                        Map<String , Object> map , HttpServletRequest request){

        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            request.getSession().setAttribute("loginUser" , username);
            return "redirect:/main.html";
        }else {
            map.put("msg" , "用户名或密码错误");
            return "index";
        }

    }
}
