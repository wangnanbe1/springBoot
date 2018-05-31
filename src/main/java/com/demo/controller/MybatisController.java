package com.demo.controller;


import com.demo.entity.TestUser;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("mybatis")
public class MybatisController {

    @Autowired
    private UserService us;

    @RequestMapping("/sava")
    public String  saveUser(){
        TestUser ts = new TestUser();
        BigDecimal bd = new BigDecimal("123456");
        ts.setId(bd);
        ts.setName("abcd");
        ts.setPw("132456");
        //SimpleDateFormat sdf = new SimpleDateFormat("");
        ts.setLoginTime(new Date());

        us.saveUser(ts);
        return "ok";

    }


    @RequestMapping("/userPage")
    public List<TestUser> selectList(Integer page){
        if(page == null){
            page = 1;
        }

        Integer pageSize = 5;
        TestUser user = new TestUser();
        List<TestUser> list = us.selectList(user,page,pageSize);


        return list;
    }
}
