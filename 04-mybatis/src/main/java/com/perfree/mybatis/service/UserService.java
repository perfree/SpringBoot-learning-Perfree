package com.perfree.mybatis.service;

import com.perfree.mybatis.pojo.User;

/**
 * @ClassName UserController
 * @Description TODO(user service接口)
 * @Author Perfree
 * @Date 2018/10/3 7:19
 * @Version 1.0
 */
public interface UserService {
    //根据用户id查找用户信息
    User getUserById(int id);
}
