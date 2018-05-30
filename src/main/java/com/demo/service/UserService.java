package com.demo.service;

import com.demo.entity.UserTest;

public interface UserService {
    public void saveUser(UserTest users) throws Exception;
    public void updateUser(UserTest users);
    public void deleteUser(String userId);
    public UserTest queryUserById(String userId);


}
