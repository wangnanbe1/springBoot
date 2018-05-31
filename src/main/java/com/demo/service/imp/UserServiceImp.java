package com.demo.service.imp;

import com.demo.entity.TestUser;
import com.demo.mapper.TestUserMapper;
import com.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class UserServiceImp  implements UserService{

    @Autowired
    private TestUserMapper mapper;


    @Override
    public void saveUser(TestUser user) {
        mapper.insert(user);
    }

    @Override
    public void updateUser(TestUser user) {
        mapper.updateByPrimaryKey(user);
    }


    @Override
    public void daleteUserById(String id) {
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public TestUser queryUserById(String id) {
        return (TestUser) mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TestUser> selectList(TestUser user, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        Example ex = new Example(TestUser.class);
        Example.Criteria criteria = ex.createCriteria();
        List<TestUser> list =  mapper.selectByExample(ex);

        return list;
    }
}
