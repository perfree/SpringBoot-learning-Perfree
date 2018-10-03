package com.perfree.druid.service.impl;

import com.perfree.druid.mapper.UserMapper;
import com.perfree.druid.pojo.User;
import com.perfree.druid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO(user Service 实现)
 * @Author Perfree
 * @Date 2018/10/3 8:43
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
