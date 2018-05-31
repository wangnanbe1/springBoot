package com.demo.service;

import com.demo.entity.TestUser;

import java.util.List;

public interface UserService {
    public void saveUser(TestUser user);

    public void updateUser(TestUser user);

    public void daleteUserById(String id);

    public TestUser queryUserById(String id);
    public List<TestUser> selectList(TestUser user,Integer page,Integer pageSize);
}
