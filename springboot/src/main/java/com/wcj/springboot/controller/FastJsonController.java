package com.wcj.springboot.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wcj.springboot.pojo.User;

@Controller
@RequestMapping("fastjson")
public class FastJsonController {
    @RequestMapping("/test")
    @ResponseBody
    public User test() {
        User user = new User();
        
        user.setId(1);
        user.setUsername("jack");
        user.setPassword("jack123");
        user.setBirthday(new Date());
        
        return user;
    }
}