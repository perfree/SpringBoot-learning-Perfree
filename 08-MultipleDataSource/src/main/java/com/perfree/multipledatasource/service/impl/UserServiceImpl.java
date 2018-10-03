package com.perfree.multipledatasource.service.impl;

import com.perfree.multipledatasource.mapper.test1.User1Mapper;
import com.perfree.multipledatasource.mapper.test2.User2Mapper;
import com.perfree.multipledatasource.pojo.User;
import com.perfree.multipledatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService实现类
 */
@Service
public class UserServiceImpl implements UserService {

    //注入User1Mapper
    @Autowired
    private User1Mapper user1Mapper;

    //注入User2Mapper
    @Autowired
    private User2Mapper user2Mapper;

    @Override
    public User getUserByIdAndTest1(int id) {
        User user = user1Mapper.getUserById(id);
        return user;
    }

    @Override
    public User getUserByIdAndTest2(int id) {
        User user = user2Mapper.getUserById(id);
        return user;
    }
}
