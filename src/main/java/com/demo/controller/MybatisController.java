package com.demo.controller;


import com.demo.entity.UserTest;
import com.demo.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("mybatis")
public class MybatisController {

    @Autowired
    private UserServiceImp usi;

    @RequestMapping("/saveUser")
    public String saveUser() throws Exception {
        UserTest uu = new UserTest();

        uu.setId(1223334444);
        uu.setFname("aaaa");
        uu.setEname("bbbb");
        usi.saveUser(uu);
        return "添加成功";
    }
}
