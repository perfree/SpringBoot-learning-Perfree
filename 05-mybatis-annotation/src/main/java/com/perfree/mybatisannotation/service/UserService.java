package com.perfree.mybatisannotation.service;

import com.perfree.mybatisannotation.pojo.User;
/**
 * @ClassName UserService
 * @Description TODO(user Service接口)
 * @Author Perfree
 * @Date 2018/10/3 8:42
 * @Version 1.0
 */
public interface UserService {
    User getUserById(int id);
}
