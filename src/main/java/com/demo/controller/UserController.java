package com.demo.controller;

import com.demo.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class UserController {


    @RequestMapping("getUser")
    public User UserController(){
        User user = new User();
        user.setBrithday(new Date());
        user.setNeme("hello");
        user.setAge(15);
        user.setPassword("123456");
        user.setDesc(null);
        return user;
    }
}
