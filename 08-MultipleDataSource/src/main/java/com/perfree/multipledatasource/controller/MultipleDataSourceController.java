package com.perfree.multipledatasource.controller;

import com.perfree.multipledatasource.pojo.User;
import com.perfree.multipledatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MultipleDataSourceController
 */
@RestController
public class MultipleDataSourceController {

    @Autowired
    private UserService userService;

    //从数据库test1根据用户id查询用户信息
    @RequestMapping("/test1/getUser")
    public String getUserByIdAndTest1(){
        User user = userService.getUserByIdAndTest1(1);
        return user.getName();
    }

    //从数据库test2根据用户id查询用户信息
    @RequestMapping("/test2/getUser")
    public String getUserByIdAndTest2(){
        User user = userService.getUserByIdAndTest2(1);
        return user.getName();
    }

}
