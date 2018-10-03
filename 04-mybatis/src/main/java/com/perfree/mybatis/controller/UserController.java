package com.perfree.mybatis.controller;

import com.perfree.mybatis.pojo.User;
import com.perfree.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO(user controller)
 * @Author Perfree
 * @Date 2018/10/3 7:18
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUserById(){
        //根据id查找用户信息
        User user = userService.getUserById(1);
        return user.getName();
    }
}
