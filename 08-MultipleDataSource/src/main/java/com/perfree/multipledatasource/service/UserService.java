package com.perfree.multipledatasource.service;

import com.perfree.multipledatasource.pojo.User;

/**
 * UserService接口
 */
public interface UserService {

    //从test1数据库中根据id查找用户信息
    User getUserByIdAndTest1(int id);

    //从test2数据库中根据id查找用户信息
    User getUserByIdAndTest2(int id);
}
