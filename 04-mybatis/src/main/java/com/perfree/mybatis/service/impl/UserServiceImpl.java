package com.perfree.mybatis.service.impl;

import com.perfree.mybatis.mapper.UserMapper;
import com.perfree.mybatis.pojo.User;
import com.perfree.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO(user Service 实现类)
 * @Author Perfree
 * @Date 2018/10/3 7:23
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        User user = userMapper.getUserById(id);
        return user;
    }
}
