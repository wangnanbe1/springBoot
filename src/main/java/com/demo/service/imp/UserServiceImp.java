package com.demo.service.imp;

import com.demo.entity.UserTest;
import com.demo.mapper.UserTestMapper;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserTestMapper mapper;

    @Override
    public void saveUser(UserTest users) throws Exception {
        mapper.insert(users);
    }

    @Override
    public void updateUser(UserTest users) {
        mapper.updateByPrimaryKeySelective(users);
    }

    @Override
    public void deleteUser(String userId) {
        mapper.deleteByPrimaryKey(userId);
    }

    @Override
    public UserTest queryUserById(String userId) {
        return null;
    }
}
