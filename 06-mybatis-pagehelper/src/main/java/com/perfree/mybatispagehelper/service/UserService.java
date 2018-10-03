package com.perfree.mybatispagehelper.service;

import com.perfree.mybatispagehelper.common.PageResult;
import com.perfree.mybatispagehelper.pojo.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO(userService 接口)
 * @Author Perfree
 * @Date 2018/10/3 10:20
 * @Version 1.0
 */
public interface UserService {
    PageResult<User> getUserByPage(Integer page, Integer pageSize);
}
